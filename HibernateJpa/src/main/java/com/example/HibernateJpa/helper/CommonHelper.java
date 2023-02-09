package com.example.HibernateJpa.helper;

import org.springframework.stereotype.Component;
import com.example.HibernateJpa.model.CommonResponse;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class CommonHelper {
	
	public CommonResponse getResponseDetails(int code, String desc, Object data) {
		
		
		log.info("Inside getResponseDetails :: with code{} ,desc{}, obj{}",code,desc,data);
		CommonResponse commonResponseDetails = new CommonResponse();
		commonResponseDetails.setCode(code);
		commonResponseDetails.setDesc(desc);
		commonResponseDetails.setData(data);
		return commonResponseDetails;
		
	}
}