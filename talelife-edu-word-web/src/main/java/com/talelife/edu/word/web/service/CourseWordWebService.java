package com.talelife.edu.word.web.service;

import com.talelife.edu.word.dao.entity.CourseWord;
import com.talelife.framework.service.CrudService;

public interface CourseWordWebService extends CrudService<CourseWord>{
	void lookupAndFixWord(CourseWord source);
	void lookupAndFixWord(Long courseId);
	void addCourseWord(Long courseId);
	void exportJsonFile(Long courseId);
	void downloadSound(Long courseId);
}

