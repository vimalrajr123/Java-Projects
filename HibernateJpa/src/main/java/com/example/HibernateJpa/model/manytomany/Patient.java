package com.example.HibernateJpa.model.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	@Column(name = "patientName")
	private String patientName;
	@Column(name = "patientAge")
	private int patientAge;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="patient_vehicle",joinColumns =@JoinColumn(name="patient_id"),inverseJoinColumns=@JoinColumn(name="vehicle_id") )
	private List<Vehicle> vehicle;

	public Patient(String patientName, int patientAge, List<Vehicle> vehicle) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.vehicle = vehicle;
	}

	public Patient() {
		super();
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}


}
