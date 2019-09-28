package com.talelife.edu.word.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talelife.framework.mapper.CrudMapper;
import com.talelife.edu.word.dao.CourseMapper;
import com.talelife.edu.word.dao.entity.Course;
import com.talelife.edu.word.web.service.CourseWebService;

@Service
public class CourseWebServiceImpl implements CourseWebService {
	@Autowired
	private CourseMapper mapper;

	@Override
	public CrudMapper<Course> getDao() {
		return this.mapper;
	}
}
