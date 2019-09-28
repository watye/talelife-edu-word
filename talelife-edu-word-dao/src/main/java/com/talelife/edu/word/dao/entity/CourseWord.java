package com.talelife.edu.word.dao.entity;

import com.talelife.framework.entity.BaseEntity;

/**
 * 课程单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
public class CourseWord extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
		private Long id;
	/**
	 * 分类id
	 */
	private Long courseId;
	/**
	 * 单词
	 */
	private String name;
	/**
	 * 音标
	 */
	private String soundmark;
	/**
	 * 中文
	 */
	private String mean;
	/**
	 * url
	 */
	private String url;
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
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getCourseId() {
		return courseId;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setSoundmark(String soundmark) {
		this.soundmark = soundmark;
	}

	public String getSoundmark() {
		return soundmark;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getMean() {
		return mean;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return sort;
	}

	@Override
	public String toString() {
		return "CourseWord [id=" + id + ", courseId=" + courseId + ", name=" + name + ", soundmark=" + soundmark
				+ ", mean=" + mean + ", url=" + url + ", sort=" + sort + "]";
	}
}