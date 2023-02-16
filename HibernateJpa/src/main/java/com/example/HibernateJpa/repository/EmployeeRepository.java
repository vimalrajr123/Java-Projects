package com.example.HibernateJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HibernateJpa.model.manytoone.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
