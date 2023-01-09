package com.example.dbs.ibanking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Data;



@Data  //getter and setters
//@AllArgsConstructor //one constructor with all arguments
//@RequiredArgsConstructor  //one constructor with set of argumentsNoArgsConstructor  //default constructor 
@Entity //DAO class
@Table(name="Movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Genere")
	private String genere;
	@Column(name="Year")
	private int year;
	@Column(name="Minutes")
	private int minutes;
	
	
	public Movies() {
		// TODO Auto-generated constructor stub
		// default constructor
	}
	
	public Movies(String name, String genere, int year, int minutes) {
		super();
		this.name = name;
		this.genere = genere;
		this.year = year;
		this.minutes = minutes;
	}


}
