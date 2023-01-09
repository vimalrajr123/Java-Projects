package com.example.dbs.ibanking.helper;

import org.springframework.stereotype.Component;

import com.example.dbs.ibanking.model.CommonResponse;

@Component
public class IbankHelper {
	
	
	
	public CommonResponse getResponseDetails(int code, String desc, Object obj) {
		
		CommonResponse commonResponseDetails = new CommonResponse();
		commonResponseDetails.setCode(code);
		commonResponseDetails.setDesc(desc);
		commonResponseDetails.setUser(obj);
		return commonResponseDetails;
		
	}
	

}
