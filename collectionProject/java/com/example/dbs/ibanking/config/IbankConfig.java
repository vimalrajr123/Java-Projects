package com.example.dbs.ibanking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class IbankConfig {
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
//	@Bean
//	public IbankHelper ibankHelper() {
//	    return new IbankHelper();
//	}
	

}
