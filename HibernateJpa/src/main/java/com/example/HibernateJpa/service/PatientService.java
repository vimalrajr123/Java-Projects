package com.example.HibernateJpa.service;

import java.util.List;

import com.example.HibernateJpa.model.manytomany.Patient;
import com.example.HibernateJpa.model.manytomany.PatientDTO;
import com.example.HibernateJpa.model.manytomany.Vehicle;
import com.example.HibernateJpa.model.manytomany.VehicleDTO;

public interface PatientService {
	
	Patient createNewPatient(PatientDTO patientDTO);
	
	Vehicle createNewVehicle(VehicleDTO vehicleDTO);

}
