package com.example.HibernateJpa.model.manytomany;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VehicleDTO {
	
	private int vehicleId;
	private String vehicleType;
	private String vehicleNumber;
	private List<PatientDTO> patient;

}
