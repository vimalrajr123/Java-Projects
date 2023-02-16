package com.example.HibernateJpa.model.manytomany;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;
	@Column(name = "vehicleType")
	private String vehicleType;
	@Column(name = "vehicleNumber")
	private String vehicleNumber;
	
	@ManyToMany(mappedBy ="vehicle")
	private List<Patient> patient;

	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleType, String vehicleNumber, List<Patient> patient) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.patient = patient;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	
	
	
	
	
	
	
	
	

}
