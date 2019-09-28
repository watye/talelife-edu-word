package com.talelife.edu.word.web.enums;

/**
 * 业务异常码
 * @author lwy
 */
public enum BizExceptionCode {
	/**
	 * 数据不允许删除
	 */
	DATA_CANNOT_DELETE(2001,"数据不允许删除");
	
	private Integer code;
	private String message;
	private BizExceptionCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}