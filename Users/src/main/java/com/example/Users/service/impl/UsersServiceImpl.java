package com.example.Users.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Users.model.CommonResponse;
import com.example.Users.model.Users;
import com.example.Users.service.UserService;

import lombok.extern.slf4j.Slf4j;

import com.example.Users.repository.UsersRepository;

@Slf4j
@Service
public class UsersServiceImpl implements UserService {

	@Autowired
	UsersRepository usersRespository;
	
	@Value("${app.baseUrl}")
	String url;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public List<Users> getAllUsers() {
		//Optional is may or may not contain null value
		List<Users> result = new ArrayList<Users>();
		result =usersRespository.findAll();
		return result;
	}

	@Override
	public Users getUsersById(int id) {
		log.info("Inside IMPL getUsersById :: with Id "+id);
		Optional<Users> user = usersRespository.findById(id);
		log.info("after findById repository call :: user output:"+user);
		if(user.isEmpty()) {
			return null;
		}
		Users result = user.get();
		log.info("after fetching the record::Users -"+result);
		return result;
	}

	@Override
	public void deleteUsersById(int id) {
		//need exception handling
		usersRespository.deleteById(id);
		
	}

	@Override
	public Users updateUsersNameById(int id, String name) {
		log.info("Inside IMPL updateUsersNameById :: with Id = {} and Name = {}",id,name);
		Optional<Users> user = usersRespository.findById(id);
		log.info("after findById repository call :: user output:"+user);
		Users userDetails = user.get();
		userDetails.setName(name);

		Users result = usersRespository.save(userDetails);
		log.info("after updating record :: result output:"+result);
		return result;
		


	}

	@Override
	public Users createNewUsers(String name, String designation, int salary, int age) {
		Users user = new Users(name,designation,salary,age);
		Users result = usersRespository.save(user);
		
		return result;
	}

	@Override
	public CommonResponse getMoviesByIdFromIbank(int id) {
		CommonResponse commonResponse;
		ResponseEntity<CommonResponse> responseEntity = restTemplate.getForEntity(url+"/getMoviesById/{id}", CommonResponse.class);
		commonResponse = responseEntity.getBody();
		return commonResponse;
	}
	
	

}
