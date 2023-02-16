package com.example.HibernateJpa.service;

import com.example.HibernateJpa.model.manytoone.Employee;
import com.example.HibernateJpa.model.manytoone.EmployeeDTO;

public interface EmployeeService {
	
	Employee createNewEmployee(EmployeeDTO employeeDTO);
}
