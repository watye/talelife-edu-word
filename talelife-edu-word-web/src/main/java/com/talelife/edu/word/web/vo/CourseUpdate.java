package com.talelife.edu.word.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
/**
 * 课程
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-08-27 19:54:26
 */
public class CourseUpdate implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@NotNull(message = "不能为空")
			@ApiModelProperty(value = "")
	private Long id;
	/**
	 * 课程名称
	 */
		@NotBlank(message="课程名称不能为空")
	@Length(max = 50,message = "课程名称最大50个字符")
	@ApiModelProperty(value = "课程名称")
	private String courseName;
	/**
	 * 序号
	 */
	@NotNull(message = "序号不能为空")
			@ApiModelProperty(value = "序号")
	private Integer sort;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * 获取：课程名称
	 */
	public String getCourseName() {
		return courseName;
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
