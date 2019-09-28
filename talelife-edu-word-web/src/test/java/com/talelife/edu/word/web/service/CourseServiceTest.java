package com.talelife.edu.word.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.talelife.edu.word.web.AbstractTest;
import com.talelife.edu.word.dao.entity.Course;
import com.talelife.edu.word.web.service.CourseWebService;

public class CourseServiceTest extends AbstractTest{
	@Autowired
	private CourseWebService courseWebService;
	
	@Test
	public void testSave(){
		Course entity = new Course();
		courseWebService.save(entity);
	}
	
	@Test
	public void testGetById(){
		courseWebService.getById(1L);
	}
	
	@Test
	public void testGetByIds(){
		List<Long> ids = new ArrayList<>();
		ids.add(1L);
		ids.add(2L);
		courseWebService.getByIds(ids);
	}
	
	@Test
	public void testGet(){
		Course entity = new Course();
		courseWebService.get(entity);
	}
	
	@Test
	public void testFindList(){
		Course entity = new Course();
		courseWebService.findList(entity);
	}
	
	@Test
	public void testFindAll(){
		courseWebService.findAll();
	}
	
	@Test
	public void testGetCount(){
		Course entity = new Course();
		courseWebService.getCount(entity);
	}
	
	@Test
	public void testUpdateById(){
		Course entity = new Course();
		courseWebService.updateById(entity);
	}
	
	@Test
	public void testUpdateByIds(){
		Course entity = new Course();
		courseWebService.updateByIds(entity,new Long[]{2L,3L});
	}
	
	@Test
	public void testDeleteById(){
		courseWebService.deleteById(4L);
	}
	
	@Test
	public void testDeleteByIds(){
		courseWebService.deleteByIds(Arrays.asList(2L,3L));
	}
	
	@Test
	public void testDelete(){
		Course entity = new Course();
		courseWebService.delete(entity);
	}
}
