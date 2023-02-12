package com.example.HibernateJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HibernateJpa.helper.CommonHelper;
import com.example.HibernateJpa.model.CommonResponse;
import com.example.HibernateJpa.model.onetomany.Person;
import com.example.HibernateJpa.model.onetomany.PersonDTO;
import com.example.HibernateJpa.service.PersonService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@Autowired
	CommonHelper commonHelper;
	
	@PostMapping(value = "/createNewPerson",consumes="application/json")
	public ResponseEntity<CommonResponse> createNewPerson(@RequestBody PersonDTO personDTO){
		log.info("Inside createNewperson :: with personDTO object"+personDTO);
		CommonResponse personResponse; 
		Person person = personService.createNewPerson(personDTO);
		personResponse = commonHelper.getResponseDetails(200, "users created successfully", person);
		return new ResponseEntity<CommonResponse>(personResponse,HttpStatus.OK);
	}

}
