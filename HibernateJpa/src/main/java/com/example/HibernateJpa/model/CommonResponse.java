package com.example.HibernateJpa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CommonResponse {
	
	private int code;
	private String desc;
	private Object data;
	
}
