package com.talelife.edu.word.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.talelife.framework.entity.Page;
import com.talelife.framework.entity.PageQueryParameter;
import com.talelife.framework.util.BeanUtils;
import com.talelife.framework.annotation.ResponseResult;
import com.talelife.framework.controller.BaseController;
import com.talelife.edu.word.web.dto.CourseWordDto;
import com.talelife.edu.word.dao.entity.CourseWord;
import com.talelife.edu.word.web.service.CourseWordWebService;
import com.talelife.edu.word.web.vo.CourseWordAdd;
import com.talelife.edu.word.web.vo.CourseWordQuery;
import com.talelife.edu.word.web.vo.CourseWordUpdate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 课程单词
 * @author lwy
 *
 */
@Api(value="controller")
@RestController
@ResponseResult
@RequestMapping("/web/courseWord")
public class CourseWordWebController extends BaseController {
	@Resource
	private CourseWordWebService courseWordWebService;

	@ApiOperation(value = "分页查询")
	@GetMapping(value = "/page")
	public Page<CourseWordDto> page(@Validated PageQueryParameter<CourseWordQuery> pageQuery) {
		CourseWord courseWord = BeanUtils.map(pageQuery.getQuery(), CourseWord.class);
		PageInfo<CourseWord> page = courseWordWebService.findListPage(courseWord,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<CourseWordDto> courseWordList = BeanUtils.mapAsList(page.getList(), CourseWord.class, CourseWordDto.class);
		return new Page<CourseWordDto>(page,courseWordList);
	}

	@ApiOperation(value = "查询单个")
	@GetMapping(value="/{id}")
	public CourseWordDto getCourseWord(@PathVariable @ApiParam(value="用户id") Long id) {
		CourseWord courseWord = courseWordWebService.getById(id);
		return BeanUtils.map(courseWord, CourseWordDto.class);
	}

	@ApiOperation(value = "新增")
	@PostMapping(value="/add")
	public void add(@Validated CourseWordAdd courseWordAdd) {
		courseWordWebService.save(BeanUtils.map(courseWordAdd,CourseWord.class));
	}

	@ApiOperation(value = "修改")
	@PutMapping(value="/{id}")
	public void update(@PathVariable Long id,CourseWordUpdate courseWordUpdate) {
		courseWordWebService.updateById(BeanUtils.map(courseWordUpdate,CourseWord.class));
	}
	
	@ApiOperation(value = "删除")
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable @ApiParam(value="id") Long id) {
		courseWordWebService.deleteById(id);
	}
}