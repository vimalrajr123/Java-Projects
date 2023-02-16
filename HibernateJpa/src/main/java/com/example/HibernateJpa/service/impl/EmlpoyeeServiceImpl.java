package com.example.HibernateJpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.HibernateJpa.model.manytoone.Employee;
import com.example.HibernateJpa.model.manytoone.EmployeeDTO;
import com.example.HibernateJpa.repository.EmployeeRepository;
import com.example.HibernateJpa.service.EmployeeService;

@Service
public class EmlpoyeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee createNewEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setName(employeeDTO.getName());
		employee.setCompanyAddress(employeeDTO.getCompanyAddress());
		Employee result = employeeRepository.save(employee);
		System.out.println(result);
		return result;
	}

}
