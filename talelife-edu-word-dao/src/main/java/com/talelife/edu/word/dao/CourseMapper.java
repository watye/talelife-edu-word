package com.talelife.edu.word.dao;

import com.talelife.framework.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import com.talelife.edu.word.dao.entity.Course;

/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
@Mapper
public interface CourseMapper extends CrudMapper<Course> {
	
}
