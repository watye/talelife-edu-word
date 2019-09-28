package com.talelife.edu.word.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
public class CourseQuery implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Long id;
	/**
	 * 课程名称
	 */
	@ApiModelProperty(value = "课程名称")
	private String courseName;
	/**
	 * 序号
	 */
	@ApiModelProperty(value = "序号")
	private Integer sort;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getSort() {
		return sort;
	}
}
