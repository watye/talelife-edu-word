package com.talelife.edu.word.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
/**
 * 课程单词
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
public class CourseWordAdd implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@NotNull(message = "主键不能为空")
			@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 分类id
	 */
	@NotNull(message = "分类id不能为空")
			@ApiModelProperty(value = "分类id")
	private Long courseId;
	/**
	 * 单词
	 */
	@NotNull(message = "单词不能为空")
			@ApiModelProperty(value = "单词")
	private Long name;
	/**
	 * 音标
	 */
		@NotBlank(message="音标不能为空")
	@Length(max = 20,message = "音标最大20个字符")
	@ApiModelProperty(value = "音标")
	private String soundmark;
	/**
	 * 中文
	 */
		@NotBlank(message="中文不能为空")
	@Length(max = 50,message = "中文最大50个字符")
	@ApiModelProperty(value = "中文")
	private String mean;
	/**
	 * url
	 */
		@NotBlank(message="url不能为空")
	@Length(max = 50,message = "url最大50个字符")
	@ApiModelProperty(value = "url")
	private String url;
	/**
	 * 序号
	 */
	@NotNull(message = "序号不能为空")
			@ApiModelProperty(value = "序号")
	private Integer sort;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：分类id
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	/**
	 * 获取：分类id
	 */
	public Long getCourseId() {
		return courseId;
	}
	/**
	 * 设置：单词
	 */
	public void setName(Long name) {
		this.name = name;
	}
	/**
	 * 获取：单词
	 */
	public Long getName() {
		return name;
	}
	/**
	 * 设置：音标
	 */
	public void setSoundmark(String soundmark) {
		this.soundmark = soundmark;
	}
	/**
	 * 获取：音标
	 */
	public String getSoundmark() {
		return soundmark;
	}
	/**
	 * 设置：中文
	 */
	public void setMean(String mean) {
		this.mean = mean;
	}
	/**
	 * 获取：中文
	 */
	public String getMean() {
		return mean;
	}
	/**
	 * 设置：url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：序号
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：序号
	 */
	public Integer getSort() {
		return sort;
	}
}
