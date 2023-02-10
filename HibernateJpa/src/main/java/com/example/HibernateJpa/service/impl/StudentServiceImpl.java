package com.example.HibernateJpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HibernateJpa.model.onetoone.Passport;
import com.example.HibernateJpa.model.onetoone.Student;
//import com.example.HibernateJpa.repository.PassportRepository;
import com.example.HibernateJpa.repository.StudentRepository;
import com.example.HibernateJpa.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student createNewStudent(String name, String number) {		
		
		Passport passportObj= new Passport();
		passportObj.setPassportNumber(number);
		Student student = new Student(name,passportObj);
		Student result = studentRepository.save(student);
		return result;
	}
	
}
