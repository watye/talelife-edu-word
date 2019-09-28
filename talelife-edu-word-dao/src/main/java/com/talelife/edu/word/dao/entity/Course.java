package com.talelife.edu.word.dao.entity;

import com.talelife.framework.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
public class Course extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
		private Long id;
	/**
	 * 课程名称
	 */
	private String courseName;
	/**
	 * 序号
	 */
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
