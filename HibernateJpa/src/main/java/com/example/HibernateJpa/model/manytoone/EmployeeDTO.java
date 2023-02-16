package com.example.HibernateJpa.model.manytoone;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmployeeDTO {
	
	private int employeeId;
	private String name;
	private CompanyAddress companyAddress;

}
