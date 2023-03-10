package com.dbs.bank.ibanking.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.bank.ibanking.model.User;
import com.dbs.bank.ibanking.repository.UserRepository;
import com.dbs.bank.ibanking.service.IbankingService;
import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class IbankingServiceImpl implements IbankingService{

	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		
		Optional<User> user = userRepository.findById(id); //optional is may or may not contain null value
		if(user.isEmpty()) {
			return null;
		}
		User result=user.get();
		return result;
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	@Override
	public User updateUserNameById(int id, String Name) {
		// TODO Auto-generated method stub
		
		Optional<User> user = userRepository.findById(id);
		User userDetails = user.get();
		userDetails.setName(Name);
		
		User result = userRepository.save(userDetails);
		return result;
	}

	@Override
	public User createNewUser(String name, String designation, int salary, int age) {
		// TODO Auto-generated method stub
		
		User user = new User(name,designation,salary,age);
		User result = userRepository.save(user);
		
		return result;
	}
	
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		System.out.println("entered service");
		List<User> users = new ArrayList<User>();
		users = userRepository.findAll();
		
		return users;
	}

}
