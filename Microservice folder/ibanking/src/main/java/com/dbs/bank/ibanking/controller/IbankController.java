package com.dbs.bank.ibanking.controller;


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
import com.dbs.bank.ibanking.Helper.IbankHelper;
import com.dbs.bank.ibanking.model.User;
import com.dbs.bank.ibanking.model.UserDTO;
import com.dbs.bank.ibanking.model.UserResponse;
import com.dbs.bank.ibanking.service.IbankingService;
import lombok.extern.slf4j.Slf4j;

@RestController   
@RequestMapping("/ibank")
@Slf4j
public class IbankController {
	
	
	@Autowired
	IbankingService ibankingService;
	
	@Autowired
	IbankHelper ibankHelper;
	
	//@RequestMapping(value= "/getUserById/{id}",method=RequestMethod.GET,consumes ="application/json",produces = "application/json")
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable int id) {
		
		UserResponse userResponse ; 
		
		User user = ibankingService.getUserById(id);
		if(user==null){
			//runtime exception  
			userResponse = ibankHelper.getResponseDetails(404, "User not found", user);
			return new ResponseEntity<UserResponse>(userResponse, HttpStatus.NOT_FOUND);
			}  
		
		userResponse = ibankHelper.getResponseDetails(200, "User retrieved successfully", user);
		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUserById/{id}")
	public ResponseEntity<UserResponse> deleteUserById(@PathVariable int id) {
		ibankingService.deleteUserById(id);
		return null;
	}
	
	@PutMapping("updateUserNameById/{id}/{Name}")
	public ResponseEntity<UserResponse> updateUserById(@PathVariable int id,@PathVariable String Name){
		
		UserResponse userResponse; 
		User user = ibankingService.updateUserNameById(id,Name);
		userResponse = ibankHelper.getResponseDetails(200, "User updated successfully", user);
		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
	}
	
	
	@PostMapping("/createnewuser")
	public ResponseEntity<UserResponse> createNewUser(@RequestBody UserDTO userDTO){
		
		UserResponse userResponse; 
		User user = ibankingService.createNewUser(userDTO.getName(),userDTO.getDesignation(),userDTO.getSalary(),userDTO.getAge());
		userResponse = ibankHelper.getResponseDetails(200, "User created successfully", user);
		return new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
	}
	
	@GetMapping("/getallusers")
	public ResponseEntity<UserResponse> getAllUsers(){
		
		System.out.println("entered controller");
		UserResponse userResponse;
		List<User> user =ibankingService.getAllUsers();
 		if(user==null){
			//runtime exception  
			userResponse = ibankHelper.getResponseDetails(404, "No Users found", user);
			return new ResponseEntity<UserResponse>(userResponse, HttpStatus.NOT_FOUND);
			}  
		
		userResponse = ibankHelper.getResponseDetails(200, "Users retrieved successfully", user);
		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
		
	}
		
}
	
	
	
	

