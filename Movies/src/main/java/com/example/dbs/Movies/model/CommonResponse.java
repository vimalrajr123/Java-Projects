package com.example.dbs.Movies.model;


import lombok.Data;

public class CommonResponse {
	
	//DTO class
	private int code;
	private String desc;
	private Object obj;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	

}
