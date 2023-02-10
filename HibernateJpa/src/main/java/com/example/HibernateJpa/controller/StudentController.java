package com.example.HibernateJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.HibernateJpa.helper.CommonHelper;
import com.example.HibernateJpa.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import com.example.HibernateJpa.model.CommonResponse;
import com.example.HibernateJpa.model.onetoone.Student;


@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	CommonHelper commonHelper;
	
	@PostMapping("/createNewStudent/{name}/{number}")
	public ResponseEntity<CommonResponse> createNewStudent(@PathVariable String name, @PathVariable String number){
		log.info("Inside createNewStudent :: with student and passport details"+name,number);
		CommonResponse studentResponse; 
		Student student = studentService.createNewStudent(name, number);
		studentResponse = commonHelper.getResponseDetails(200, "users created successfully", student);
		return new ResponseEntity<CommonResponse>(studentResponse,HttpStatus.OK);
	}
	
	
	

}
