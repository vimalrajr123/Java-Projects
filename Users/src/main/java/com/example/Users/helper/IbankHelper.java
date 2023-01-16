package com.example.Users.helper;

import org.springframework.stereotype.Component;
import com.example.Users.model.CommonResponse;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class IbankHelper {
	
	public CommonResponse getResponseDetails(int code, String desc, Object data) {
		
		
		log.info("Inside getResponseDetails :: with code{} ,desc{}, obj{}",code,desc,data);
		CommonResponse commonResponseDetails = new CommonResponse();
		commonResponseDetails.setCode(code);
		commonResponseDetails.setDesc(desc);
		commonResponseDetails.setData(data);
		return commonResponseDetails;
		
	}
}