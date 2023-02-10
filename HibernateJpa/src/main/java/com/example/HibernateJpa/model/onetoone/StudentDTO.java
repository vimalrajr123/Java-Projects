package com.example.HibernateJpa.model.onetoone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentDTO {
	
	private int studentId;
	private String studentName;
	private Passport passport;

}
