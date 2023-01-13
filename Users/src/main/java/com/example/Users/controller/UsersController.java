package com.example.Users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Users.helper.IbankHelper;
import com.example.Users.service.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	IbankHelper ibankHelper;
	

}
