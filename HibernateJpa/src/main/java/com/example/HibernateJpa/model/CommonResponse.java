package com.example.HibernateJpa.model;

import lombok.Data;

@Data
public class CommonResponse {
	
	private int code;
	private String desc;
	private Object data;
	
}
