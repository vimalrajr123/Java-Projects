package com.dbs.bank.ibanking.Helper;

import org.springframework.stereotype.Component;

import com.dbs.bank.ibanking.model.UserResponse;

@Component
public class IbankHelper {
	
	
	
	public UserResponse getResponseDetails(int code, String desc, Object user) {
		
		UserResponse userResponse = new UserResponse();
		userResponse.setCode(code);
		userResponse.setDesc(desc);
		userResponse.setUser(user);
		return userResponse;
		
	}

}
