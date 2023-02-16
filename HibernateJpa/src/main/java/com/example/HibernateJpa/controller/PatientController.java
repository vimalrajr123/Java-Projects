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
import com.example.HibernateJpa.model.manytomany.Patient;
import com.example.HibernateJpa.model.manytomany.PatientDTO;
import com.example.HibernateJpa.model.manytomany.Vehicle;
import com.example.HibernateJpa.model.manytomany.VehicleDTO;
import com.example.HibernateJpa.service.PatientService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	CommonHelper commonHelper;
	
	@PostMapping(value = "/createNewPatient",consumes="application/json")
	public ResponseEntity<CommonResponse> createNewPatient(@RequestBody PatientDTO patientDTO){
		log.info("Inside createNewperson :: with personDTO object"+patientDTO);
		CommonResponse patientResponse; 
		Patient patient = patientService.createNewPatient(patientDTO);
		patientResponse = commonHelper.getResponseDetails(200, "users created successfully", patient);
		return new ResponseEntity<CommonResponse>(patientResponse,HttpStatus.OK);
	}
	
	@PostMapping(value = "/createNewVehicle",consumes="application/json")
	public ResponseEntity<CommonResponse> createNewVehicle(@RequestBody VehicleDTO vehicleDTO){
		log.info("Inside createNewVehicle :: with vehicleDTO object"+vehicleDTO);
		CommonResponse vehicleResponse; 
		Vehicle vehicle = patientService.createNewVehicle(vehicleDTO);
		vehicleResponse = commonHelper.getResponseDetails(200, "vehicle created successfully", vehicle);
		return new ResponseEntity<CommonResponse>(vehicleResponse,HttpStatus.OK);
	}
	
	

}
