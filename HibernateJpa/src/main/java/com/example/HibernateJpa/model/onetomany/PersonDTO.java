package com.example.HibernateJpa.model.onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonDTO {
	
	private int personId;
	private String personName;
	private int age;
	
}
