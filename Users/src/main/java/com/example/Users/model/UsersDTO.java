package com.example.Users.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class UsersDTO {
	
	private String name;
	private String designation;
	private int salary;
	private int age;
}
