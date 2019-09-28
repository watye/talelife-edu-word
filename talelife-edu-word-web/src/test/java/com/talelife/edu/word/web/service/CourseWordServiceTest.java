package com.talelife.edu.word.web.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.talelife.edu.word.web.AbstractTest;

public class CourseWordServiceTest extends AbstractTest{
	@Autowired
	private CourseWordWebService courseWordWebService;
	
	@Test
	public void testAddCourseWord1(){
		courseWordWebService.addCourseWord(1L);
	}
	
	@Test
	public void testLookupAndFixWord(){
		courseWordWebService.lookupAndFixWord(1L);
	}
	
	@Test
	public void testExportJsonFile(){
		courseWordWebService.exportJsonFile(1L);
	}
	
	@Test
	public void testDownloadSound(){
		courseWordWebService.downloadSound(1L);
	}
}
