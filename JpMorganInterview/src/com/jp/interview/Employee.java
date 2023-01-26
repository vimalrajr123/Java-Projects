package com.jp.interview;

import java.util.Date;

public final class Employee {
	
	
	public Employee(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	final String name;
	final Date dob;
	public String getName() {
		return name;
	}	
	public Date getDob() {
		return dob;
	}
	
}	

