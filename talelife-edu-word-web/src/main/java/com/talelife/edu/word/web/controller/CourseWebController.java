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
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.talelife.framework.entity.Page;
import com.talelife.framework.entity.PageQueryParameter;
import com.talelife.framework.util.BeanUtils;
import com.talelife.framework.annotation.ResponseResult;
import com.talelife.framework.controller.BaseController;
import com.talelife.edu.word.web.dto.CourseDto;
import com.talelife.edu.word.dao.entity.Course;
import com.talelife.edu.word.web.service.CourseWebService;
import com.talelife.edu.word.web.vo.CourseAdd;
import com.talelife.edu.word.web.vo.CourseQuery;
import com.talelife.edu.word.web.vo.CourseUpdate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 课程
 * @author lwy
 *
 */
@Api(value="controller")
@RestController
@ResponseResult
@RequestMapping("/web/course")
public class CourseWebController extends BaseController {
	@Resource
	private CourseWebService courseWebService;

	@ApiOperation(value = "分页查询")
	@GetMapping(value = "/page")
	public Page<CourseDto> page(@Validated PageQueryParameter<CourseQuery> pageQuery) {
		Course course = BeanUtils.map(pageQuery.getQuery(), Course.class);
		PageInfo<Course> page = courseWebService.findListPage(course,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<CourseDto> courseList = BeanUtils.mapAsList(page.getList(), Course.class, CourseDto.class);
		return new Page<>(page,courseList);
	}

	@ApiOperation(value = "查询单个")
	@GetMapping(value="/{id}")
	public CourseDto getCourse(@PathVariable @ApiParam(value="用户id") Long id) {
		Course course = courseWebService.getById(id);
		return BeanUtils.map(course, CourseDto.class);
	}

	@ApiOperation(value = "新增")
	@PostMapping(value="/add")
	public void add(@Validated CourseAdd courseAdd) {
		courseWebService.save(BeanUtils.map(courseAdd,Course.class));
	}

	@ApiOperation(value = "修改")
	@PutMapping(value="/{id}")
	public void update(@PathVariable Long id,CourseUpdate courseUpdate) {
		courseWebService.updateById(BeanUtils.map(courseUpdate,Course.class));
	}
	
	@ApiOperation(value = "删除")
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable @ApiParam(value="id") Long id) {
		courseWebService.deleteById(id);
	}
}