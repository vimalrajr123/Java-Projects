package com.example.HibernateJpa.model.manytoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CompanyAddress")
public class CompanyAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int companyAddressId;
	@Column(name="Address")
	private String address;
	@Column(name="Country")
	private String country;

	public CompanyAddress() {
		super();
	}
	
	public CompanyAddress(String address, String country) {
		super();
		this.address = address;
		this.country = country;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
