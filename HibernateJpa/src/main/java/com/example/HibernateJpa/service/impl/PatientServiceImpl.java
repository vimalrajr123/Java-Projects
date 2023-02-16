package com.example.HibernateJpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HibernateJpa.model.manytomany.Patient;
import com.example.HibernateJpa.model.manytomany.PatientDTO;
import com.example.HibernateJpa.model.manytomany.Vehicle;
import com.example.HibernateJpa.model.manytomany.VehicleDTO;
import com.example.HibernateJpa.repository.PatientRepository;
import com.example.HibernateJpa.repository.VehicleRepository;
import com.example.HibernateJpa.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public Patient createNewPatient(PatientDTO patientDTO) {
		Patient patient = new Patient();

		List<Vehicle> vehicleList = new ArrayList<>();
		List<VehicleDTO> vehicleDTOList = patientDTO.getVehicle();
		
		for(VehicleDTO v : vehicleDTOList) {
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleType(v.getVehicleType());
			vehicle.setVehicleNumber(v.getVehicleNumber());
			vehicleList.add(vehicle);
		}
		patient.setPatientName(patientDTO.getPatientName());
		patient.setPatientAge(patientDTO.getPatientAge());
		patient.setVehicle(vehicleList);
		Patient result = patientRepository.save(patient);
		return result;
	}


	@Override
	public Vehicle createNewVehicle(VehicleDTO vehicleDTO) {
		Vehicle vehicle = new Vehicle();
		
		List<Patient> patientList = new ArrayList<>();
		List<PatientDTO> patientDTOList = vehicleDTO.getPatient();
		
		for(PatientDTO p: patientDTOList) {
			Patient patient = new Patient();
			patient.setPatientName(p.getPatientName());
			patient.setPatientAge(p.getPatientAge());
			patientList.add(patient);
		}
		vehicle.setVehicleType(vehicleDTO.getVehicleType());
		vehicle.setVehicleNumber(vehicleDTO.getVehicleNumber());
		vehicle.setPatient(patientList);
		Vehicle result = vehicleRepository.save(vehicle);
		return result;
	}

}
