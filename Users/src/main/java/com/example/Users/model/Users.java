package com.example.Users.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data  //getter and setters
//@AllArgsConstructor //one constructor with all arguments
//@RequiredArgsConstructor  //one constructor with set of argumentsNoArgsConstructor  //default constructor 
//@Builder same usage like Data 
@Entity //DAO class
@Table(name="User")
public class Users {
	
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


	public Users() {
		super();
	}
	
	public Users(String name, String designation, int salary, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
	}
}
