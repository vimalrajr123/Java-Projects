package com.example.Users.service;

import java.util.List;
import com.example.Users.model.CommonResponse;
import com.example.Users.model.Users;


public interface UserService {
	
	List<Users> getAllUsers();
	
	Users getUsersById(int id);
	
	void deleteUsersById(int id);
	
	Users updateUsersNameById(int id , String name);
	
	Users createNewUsers(String name, String designation, int salary, int age);
	
	CommonResponse getMoviesByIdFromIbank(int id);
	

}
