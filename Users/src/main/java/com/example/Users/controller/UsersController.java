package com.example.Users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Users.helper.IbankHelper;
import com.example.Users.model.CommonResponse;
import com.example.Users.model.Users;
import com.example.Users.model.UsersDTO;
import com.example.Users.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	IbankHelper ibankHelper;
	
	
	//@RequestMapping(value= "/getMoviesById/{id}",method=RequestMethod.GET,consumes ="application/json",produces = "application/json")
	//@ResponseBody   //if @Controller has been used
	@GetMapping("/getUsersById/{id}")
	public ResponseEntity<CommonResponse> getUsersById(@PathVariable int id){
		log.info("Inside getUsersById :: with Id"+id);
		CommonResponse usersResponse ; 
		Users users = userService.getUsersById(id);
		if(users==null){
			//runtime exception  
			usersResponse = ibankHelper.getResponseDetails(404, "Users not found", users);
			log.info("Final response for null user :: response"+usersResponse);
			return new ResponseEntity<CommonResponse>(usersResponse, HttpStatus.NOT_FOUND);
			}  
		
		usersResponse = ibankHelper.getResponseDetails(200, "Users retrieved successfully", users);
		log.info("Final response for user :: response"+usersResponse);
		return new ResponseEntity<CommonResponse>(usersResponse, HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<CommonResponse> getAllUsers(){
		CommonResponse usersResponse;
		List<Users> users =userService.getAllUsers();
 		if(users==null){
			//runtime exception  
 			usersResponse = ibankHelper.getResponseDetails(404, "No Users found", users);
			return new ResponseEntity<CommonResponse>(usersResponse, HttpStatus.NOT_FOUND);
			}  
		
 		usersResponse = ibankHelper.getResponseDetails(200, "Users retrieved successfully", users);
		return new ResponseEntity<CommonResponse>(usersResponse, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteUsersById/{id}")
	public ResponseEntity<CommonResponse> deleteUsersById(@PathVariable int id){
		userService.deleteUsersById(id);
		return null;
		}
	
	@PostMapping("/updateUsersNameById/{id}/{name}")
	public ResponseEntity<CommonResponse> updateUsersNameById(@PathVariable int id, @PathVariable String name){
		log.info("Inside updateUsersNameById :: with Id = {} and Name = {}",id,name);
		CommonResponse usersResponse; 
		Users users = userService.updateUsersNameById(id, name);
		usersResponse = ibankHelper.getResponseDetails(200, "users updated successfully", users);
		return new ResponseEntity<CommonResponse>(usersResponse, HttpStatus.OK);
	}
	
	@PutMapping("/createNewUsers")
	public ResponseEntity<CommonResponse> createNewUsers(@RequestBody UsersDTO usersDTO){
		log.info("Inside createNewUsers :: with userDTO object"+usersDTO);
		CommonResponse usersResponse; 
		Users users = userService.createNewUsers(usersDTO.getName(),usersDTO.getDesignation(),
				usersDTO.getSalary(),usersDTO.getAge());
		usersResponse = ibankHelper.getResponseDetails(200, "users created successfully", users);
		return new ResponseEntity<CommonResponse>(usersResponse,HttpStatus.OK);
	}
	
	@GetMapping("/getMoviesByIdFromIbank/{Id}")
	public ResponseEntity<CommonResponse> getMoviesByIdFromIbank(@PathVariable int id){
		
		CommonResponse movieResponse;
		movieResponse = userService.getMoviesByIdFromIbank(id);
		if(movieResponse==null){
			//runtime exception  
			movieResponse = ibankHelper.getResponseDetails(404, "Movie not found", movieResponse);
			return new ResponseEntity<CommonResponse>(movieResponse, HttpStatus.NOT_FOUND);
			}  
		
		movieResponse = ibankHelper.getResponseDetails(200, "Movie retrieved successfully", movieResponse);
		return new ResponseEntity<CommonResponse>(movieResponse, HttpStatus.OK);
		
	}
	
	
}
