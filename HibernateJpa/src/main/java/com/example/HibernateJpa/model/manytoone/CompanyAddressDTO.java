package com.example.HibernateJpa.model.manytoone;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CompanyAddressDTO {
	
	private int companyAddressId;
	private String address;
	private String country;

}
