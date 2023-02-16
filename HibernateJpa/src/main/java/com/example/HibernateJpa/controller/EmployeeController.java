package com.example.HibernateJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.HibernateJpa.helper.CommonHelper;
import com.example.HibernateJpa.model.CommonResponse;
import com.example.HibernateJpa.model.manytoone.Employee;
import com.example.HibernateJpa.model.manytoone.EmployeeDTO;
import com.example.HibernateJpa.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	CommonHelper commonHelper;
	
	@PostMapping(value = "/createNewEmployee",consumes="application/json")
	public ResponseEntity<CommonResponse> createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
		log.info("Inside createNewperson :: with employeeDTO object"+employeeDTO);
		CommonResponse employeeResponse; 
		Employee employee = employeeService.createNewEmployee(employeeDTO);
		employeeResponse = commonHelper.getResponseDetails(200, "users created successfully", employee);
		return new ResponseEntity<CommonResponse>(employeeResponse,HttpStatus.OK);
	}

}
