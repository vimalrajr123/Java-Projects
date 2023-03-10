package com.example.dbs.ibanking.service;

import java.util.List;

import com.example.dbs.ibanking.model.CommonResponse;
import com.example.dbs.ibanking.model.User;

public interface UserService {

	User getUserById(int id);

	void deleteUserById(int id);

	User updateUserNameById(int id, String name);

	User createNewUser(String name, String designation, int salary, int age);
	
	List<User> getAllUsers();
	
	CommonResponse getMovieByIdFromIbank(int id);
	

}
