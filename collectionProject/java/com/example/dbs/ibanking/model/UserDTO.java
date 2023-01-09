package com.example.dbs.ibanking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
	
	private String name;
	private String designation;
	private int salary;
	private int age;
	
	

}
