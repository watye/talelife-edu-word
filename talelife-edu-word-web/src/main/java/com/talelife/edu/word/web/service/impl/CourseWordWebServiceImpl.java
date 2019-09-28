package com.talelife.edu.word.web.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.talelife.edu.word.dao.CourseWordMapper;
import com.talelife.edu.word.dao.entity.CourseWord;
import com.talelife.edu.word.web.config.CourseWordConfig;
import com.talelife.edu.word.web.service.CourseWordWebService;
import com.talelife.edu.word.web.util.FileUtils;
import com.talelife.framework.mapper.CrudMapper;

@Service
public class CourseWordWebServiceImpl implements CourseWordWebService {
	private static final Logger logger = LoggerFactory.getLogger(CourseWordWebServiceImpl.class);
	private static final String WORD_SOURCE_URL = "http://dict.cn/";
	private static final String WORD_AUDIO_URL = "http://audio.dict.cn/";
	private static final String SAVE_FOLDER = "d:"+File.separator+"files";
	@Autowired
	private CourseWordMapper mapper;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CrudMapper<CourseWord> getDao() {
		return this.mapper;
	}

	@Override
	public void lookupAndFixWord(CourseWord source) {
		CourseWord entity = new CourseWord();
		entity.setId(source.getId());
		String html = restTemplate.getForObject(WORD_SOURCE_URL+source.getName(), String.class);
		Document document = Jsoup.parse(html);
		logger.debug(html);
		entity.setUrl(WORD_AUDIO_URL+document.getElementsByAttribute("naudio").get(0).attr("naudio"));
		entity.setSoundmark(document.getElementsByTag("bdo").get(0).text());
		Elements means = document.getElementsByClass("dict-basic-ul").select("li");
		/*StringBuilder sb = new StringBuilder();
		for (int i=0; i<means.size()-1;i++) {
			if(i > 0){
				sb.append("|");
			}
			sb.append(means.get(i).text());
		}*/
		entity.setMean(means.get(0).text());
		mapper.updateById(entity);
		logger.debug("{}",entity);

	}

	@Override
	public void lookupAndFixWord(Long courseId) {
		List<String> properties = new ArrayList<>();
		properties.add("id");
		properties.add("name");
		List<CourseWord> list = mapper.findAll(properties);
		for (CourseWord courseWord : list) {
			lookupAndFixWord(courseWord);
		}
	}
	
	@Override
	public void addCourseWord(Long courseId) {
		List<CourseWord> entities = new ArrayList<>();
		List<String> names = CourseWordConfig.getWords(courseId);
		for (String name : names) {
			CourseWord entity = new CourseWord();
			entity.setCourseId(courseId);
			entity.setName(name);
			entity.setMean("");
			entity.setSort(0);
			entity.setSoundmark("");
			entity.setUrl("");
			entities.add(entity);
		}
		batchSave(entities);
	}

	@Override
	public void exportJsonFile(Long courseId) {
		List<CourseWord> list = mapper.findAll();
		File file = new File("D:\\word_"+courseId+".json");
		try {
			FileOutputStream out = new FileOutputStream(file);
			FileChannel channel = out.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.wrap(JSON.toJSONString(list).getBytes());
			channel.write(byteBuffer);
			out.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		
	}

	@Override
	public void downloadSound(Long courseId) {
		List<CourseWord> list = mapper.findAll();
		if(!list.isEmpty()){
			for (CourseWord courseWord : list) {
				FileUtils.downloadFile(SAVE_FOLDER,courseWord.getUrl());
			}
		}
	}

}