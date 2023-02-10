package com.example.HibernateJpa.model.onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passportId;
	@Column(name = "passportNumber")
	private String passportNumber;
	
	public Passport() {
		super();
	}

	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}
	
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	
	
	
}
