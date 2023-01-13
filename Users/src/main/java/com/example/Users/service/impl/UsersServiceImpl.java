package com.example.Users.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Users.model.Users;
import com.example.Users.service.UserService;
import com.example.Users.repository.UsersRepository;


public class UsersServiceImpl implements UserService {

	@Autowired
	UsersRepository usersRespository;
	
	@Override
	public List<Users> getAllUsers() {
		//Optional is may or may not contain null value
		List<Users> result = new ArrayList<Users>();
		result =usersRespository.findAll();
		return result;
	}

	@Override
	public Users getUserById(int id) {
		Optional<Users> user = usersRespository.findById(id);
		if(user.isEmpty()) {
			return null;
		}
		Users result = user.get();
		return result;
	}

	@Override
	public void deleteUsersById(int id) {
		//need exception handling
		usersRespository.deleteById(id);
		
	}

	@Override
	public Users updateUserNameById(int id, String name) {
		Optional<Users> user = usersRespository.findById(id);
		Users userDetails = user.get();
		userDetails.setName(name);

		Users result = usersRespository.save(userDetails);
		return result;
		


	}

	@Override
	public Users createNewUsers(String name, String designation, int salary, int age) {
		Users user = new Users(name,designation,salary,age);
		Users result = usersRespository.save(user);
		
		return result;
	}
	
	

}
