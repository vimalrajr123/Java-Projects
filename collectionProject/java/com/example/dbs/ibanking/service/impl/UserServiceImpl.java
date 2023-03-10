package com.example.dbs.ibanking.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dbs.ibanking.model.CommonResponse;
import com.example.dbs.ibanking.model.User;
import com.example.dbs.ibanking.repository.UserRepository;
import com.example.dbs.ibanking.service.UserService;




@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@Value("${app.baseUrl}")
	private String baseUrl;
	
	
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
	public User updateUserNameById(int id, String name) {
		// TODO Auto-generated method stub
		
		Optional<User> user = userRepository.findById(id);
		User userDetails = user.get();
		userDetails.setName(name);
		
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

	@Override
	public CommonResponse getMovieByIdFromIbank(int id) {
		// TODO Auto-generated method stub
		CommonResponse movieCommonResponse;
		String getMovieByIdFromIbankURL = baseUrl+"/movies/getMoviesById/"+id;
		ResponseEntity<CommonResponse> response = restTemplate.getForEntity(getMovieByIdFromIbankURL, CommonResponse.class);
		movieCommonResponse = response.getBody();
		return movieCommonResponse;
	}

}
