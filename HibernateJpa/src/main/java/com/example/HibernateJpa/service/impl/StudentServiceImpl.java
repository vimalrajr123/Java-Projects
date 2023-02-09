package com.example.HibernateJpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.HibernateJpa.model.Passport;
import com.example.HibernateJpa.model.Student;
import com.example.HibernateJpa.repository.PassportRepository;
import com.example.HibernateJpa.repository.StudentRepository;
import com.example.HibernateJpa.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	PassportRepository passportRespository;

	@Override
	public Student createNewStudent(String name, String number) {
		Passport passportObj = createNewPassport(number);
		Student student = new Student(name,passportObj);
		Student result = studentRepository.save(student);
		return result;
	}
	
	@Override
	public Passport createNewPassport(String number) {
		Passport passport = new Passport(number);
		Passport result = passportRespository.save(passport);
		return result;
	}

}
