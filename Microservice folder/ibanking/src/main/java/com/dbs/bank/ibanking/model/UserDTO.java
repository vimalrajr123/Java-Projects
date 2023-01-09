package com.dbs.bank.ibanking.model;


public class UserDTO {
	
	private String name;
	private String designation;
	private int salary;
	private int age;
	
	
	public UserDTO(String name, String designation, int salary, int age) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
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
