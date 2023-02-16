package com.example.HibernateJpa.model.manytoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	@Column(name="EmployeeName")
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)  
	@JoinColumn(name="companyAddress_Id")
	private CompanyAddress companyAddress;

	public Employee(String name, CompanyAddress companyAddress) {
		super();
		this.name = name;
		this.companyAddress = companyAddress;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyAddress getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(CompanyAddress companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	
}
