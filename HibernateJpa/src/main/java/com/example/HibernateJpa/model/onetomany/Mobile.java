package com.example.HibernateJpa.model.onetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mobile")
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int MobileId;
	@Column(name="Model")
	private String Model;
	@Column(name="Number")
	private int Number;

	public Mobile() {
		super();
	}

	public Mobile(String model, int number) {
		super();
		Model = model;
		Number = number;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	
	
	

}
