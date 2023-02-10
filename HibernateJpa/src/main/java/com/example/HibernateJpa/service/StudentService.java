package com.example.HibernateJpa.service;

import com.example.HibernateJpa.model.onetoone.Student;

public interface StudentService {
		
	Student createNewStudent(String name,String number);

}
