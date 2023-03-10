package com.example.dbs.ibanking.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbs.ibanking.helper.IbankHelper;
import com.example.dbs.ibanking.model.User;
import com.example.dbs.ibanking.model.UserDTO;
import com.example.dbs.ibanking.model.CommonResponse;
import com.example.dbs.ibanking.service.UserService;

//@Controller
@RestController   
@RequestMapping("/user")
//@Slf4j
public class UserController {
	
	
	@Autowired
	UserService ibankingService;
	
	@Autowired
	IbankHelper ibankHelper;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	//@RequestMapping(value= "/getUserById/{id}",method=RequestMethod.GET,consumes ="application/json",produces = "application/json")
	@GetMapping("/getUserById/{id}")
	//@ResponseBody
	public ResponseEntity<CommonResponse> getUserById(@PathVariable int id) {
		
		CommonResponse userResponse ; 
		
		User user = ibankingService.getUserById(id);
		if(user==null){
			//runtime exception  
			userResponse = ibankHelper.getResponseDetails(404, "User not found", user);
			return new ResponseEntity<CommonResponse>(userResponse, HttpStatus.NOT_FOUND);
			}  
		
		userResponse = ibankHelper.getResponseDetails(200, "User retrieved successfully", user);
		return new ResponseEntity<CommonResponse>(userResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUserById/{id}")
	//@ResponseBody
	public ResponseEntity<CommonResponse> deleteUserById(@PathVariable int id) {
		ibankingService.deleteUserById(id);
		return null;
	}
	
	@PutMapping("updateUserNameById/{id}/{Name}")
	//@ResponseBody
	public ResponseEntity<CommonResponse> updateUserById(@PathVariable int id,@PathVariable String Name){
		
		CommonResponse userResponse; 
		User user = ibankingService.updateUserNameById(id,Name);
		userResponse = ibankHelper.getResponseDetails(200, "User updated successfully", user);
		return new ResponseEntity<CommonResponse>(userResponse, HttpStatus.OK);
	}
	
	
	@PostMapping("/createNewUser")
	//@ResponseBody
	public ResponseEntity<CommonResponse> createNewUser(@RequestBody UserDTO userDTO){
		
		CommonResponse userResponse; 
		User user = ibankingService.createNewUser(userDTO.getName(),userDTO.getDesignation(),userDTO.getSalary(),userDTO.getAge());
		userResponse = ibankHelper.getResponseDetails(200, "User created successfully", user);
		return new ResponseEntity<CommonResponse>(userResponse,HttpStatus.OK);
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<CommonResponse> getAllUsers(){
		
		logger.info("entered controller");
		CommonResponse userResponse;
		List<User> user =ibankingService.getAllUsers();
 		if(user==null){
			//runtime exception  
			userResponse = ibankHelper.getResponseDetails(404, "No Users found", user);
			return new ResponseEntity<CommonResponse>(userResponse, HttpStatus.NOT_FOUND);
			}  
		
		userResponse = ibankHelper.getResponseDetails(200, "Users retrieved successfully", user);
		return new ResponseEntity<CommonResponse>(userResponse, HttpStatus.OK);
		
	}
	
	
	//Movies Services
	
	@GetMapping("/getMovieByIdFromIbank/{id}")
	public ResponseEntity<CommonResponse> getMovieByIdFromIbank(@PathVariable int id){
		logger.info("Entered getMovieByIdFromIbank :: "+ id);
		CommonResponse movieResponse = ibankingService.getMovieByIdFromIbank(id);
 		if(movieResponse==null){
			//runtime exception  
			return new ResponseEntity<CommonResponse>(movieResponse, HttpStatus.NOT_FOUND);
			} 
		return new ResponseEntity<CommonResponse>(movieResponse,HttpStatus.OK);
	}
	
	
	
		
}
	
	
	
	

