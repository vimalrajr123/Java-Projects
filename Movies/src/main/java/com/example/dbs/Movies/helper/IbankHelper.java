package com.example.dbs.Movies.helper;

import org.springframework.stereotype.Component;
import com.example.dbs.Movies.model.CommonResponse;


@Component
public class IbankHelper {
	
	
	
	public CommonResponse getResponseDetails(int code, String desc, Object data) {
		
		CommonResponse commonResponseDetails = new CommonResponse();
		commonResponseDetails.setCode(code);
		commonResponseDetails.setDesc(desc);
		commonResponseDetails.setData(data);
		return commonResponseDetails;
		
	}
	

}
