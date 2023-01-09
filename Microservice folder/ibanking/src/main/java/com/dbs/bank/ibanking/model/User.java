package com.dbs.bank.ibanking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Data  //getter and setters
//@AllArgsConstructor //one constructor with all arguments
//@RequiredArgsConstructor  //one constructor with set of argumentsNoArgsConstructor  //default constructor 
@Entity   //DAO class
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="Name")
	private String name;
	@Column(name="Designation")
	private String designation;
	@Column(name="Salary")
	private int salary;
	@Column(name="Age")
	private int age;
	
	
	public User() {
	}
	
	public User(String name, String designation, int salary, int age) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
