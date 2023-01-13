package com.example.Users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Users.model.Users;

@Service
public interface UserService {
	
	List<Users> getAllUsers();
	
	Users getUserById(int id);
	
	void deleteUsersById(int id);
	
	Users updateUserNameById(int id , String name);
	
	Users createNewUsers(String name, String designation, int salary, int age);
	

}
