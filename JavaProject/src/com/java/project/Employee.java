package com.java.project;

import java.util.Objects;

public class Employee {

	int id;
	int age;
	int salary;

	public Employee(int id, int age, int salary) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
	}

	// hascode null
	
	
	  @Override public int hashCode() {
	  
	  return 0; }
	 
	 
	
	
	
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * @Override public int hashCode() { System.out.println(id + " : "
	 * +Objects.hash(age, id, salary)); return Objects.hash(age, id, salary); }
	 */
	 

	
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (obj == null) return false; if (getClass() != obj.getClass()) return
	  false; Employee other = (Employee) obj; return age == other.age && id ==
	  other.id && salary == other.salary; }
	 
/*
 * 
 * @Override public boolean equals(Object obj) { return false; }
 */
	 
}
