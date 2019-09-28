package com.talelife.edu.word.dao;

import com.talelife.framework.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import com.talelife.edu.word.dao.entity.CourseWord;

/**
 * 课程单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
@Mapper
public interface CourseWordMapper extends CrudMapper<CourseWord> {
	
}
