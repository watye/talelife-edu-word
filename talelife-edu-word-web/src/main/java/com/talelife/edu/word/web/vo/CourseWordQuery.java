package com.talelife.edu.word.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 课程单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
public class CourseWordQuery implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 分类id
	 */
	@ApiModelProperty(value = "分类id")
	private Long courseId;
	/**
	 * 单词
	 */
	@ApiModelProperty(value = "单词")
	private Long name;
	/**
	 * 音标
	 */
	@ApiModelProperty(value = "音标")
	private String soundmark;
	/**
	 * 中文
	 */
	@ApiModelProperty(value = "中文")
	private String mean;
	/**
	 * url
	 */
	@ApiModelProperty(value = "url")
	private String url;
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
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setName(Long name) {
		this.name = name;
	}
	public Long getName() {
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
}
