package com.dbs.bank.ibanking.service;

import java.util.List;

import com.dbs.bank.ibanking.model.User;

public interface IbankingService {

	User getUserById(int id);

	void deleteUserById(int id);

	User updateUserNameById(int id, String Name);

	User createNewUser(String name, String designation, int salary, int age);
	
	List<User> getAllUsers();




}
