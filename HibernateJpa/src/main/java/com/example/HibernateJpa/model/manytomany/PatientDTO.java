package com.example.HibernateJpa.model.manytomany;

import java.util.List;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PatientDTO {
	
	private int patientId;
	private String patientName;
	private int patientAge;
	private List<VehicleDTO> vehicle;

}
