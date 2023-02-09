package com.example.HibernateJpa.service;

import com.example.HibernateJpa.model.Passport;
import com.example.HibernateJpa.model.Student;

public interface StudentService {
	
		
	Student createNewStudent(String name,String number);
	
	Passport createNewPassport(String number);
	

}
