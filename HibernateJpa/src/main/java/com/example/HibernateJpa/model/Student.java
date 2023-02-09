package com.example.HibernateJpa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name="studentName")
	private String studentName;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "passportId")
	private Passport passport;

	
	public Student(String studentName, Passport passport) {
		super();
		this.studentName = studentName;
		this.passport = passport;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	
	
	
}
