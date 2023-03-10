package com.example.dbs.ibanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableJpaRepositories
//@EnableSwagger2

public class IbankingApplication{

	public static void main(String[] args) {
		SpringApplication.run(IbankingApplication.class, args);
	}

}
