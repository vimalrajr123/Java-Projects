package com.example.HibernateJpa.model.onetomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	@Column(name="Name")
	private String personName;
	@Column(name="Age")
	private int age;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="userMobileMapping",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="mobile_id"))
	private List<Mobile> mobileList = new ArrayList<>();
	
	
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Person(String personName, int age) {
		super();
		this.personName = personName;
		this.age = age;
	}

	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + ", mobileList="
				+ mobileList + "]";
	}
	
	
}
