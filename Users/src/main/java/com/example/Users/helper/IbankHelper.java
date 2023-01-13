package com.example.Users.helper;

import org.springframework.stereotype.Component;

import com.example.Users.model.CommonResponse;

@Component
public class IbankHelper {
	
	public CommonResponse getResponseDetails(int code, String desc, Object obj) {
		
		CommonResponse commonResponseDetails = new CommonResponse();
		commonResponseDetails.setCode(code);
		commonResponseDetails.setDesc(desc);
		commonResponseDetails.setObj(obj);
		return commonResponseDetails;
		
	}
}