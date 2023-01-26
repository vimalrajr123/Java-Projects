package com.java.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class Student{
	int id;
	int age;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id;
	}

	Student(int id, int age){
		this.id = id;
		this.age = age;
	}
}
public class MapStudentKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student(1,1);
		Student s2 = new Student(1,1);
		Map<Student,Integer> map = new HashMap<>();
		map.put(s1,1);
		map.put(s2,2);
		
		
		String s= "welcome";
		String ss = new String("welcome").intern();
		
		System.out.println(s.hashCode() + " " + ss.hashCode());
		
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		for(Entry<Student, Integer> e : map.entrySet()) {
			
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println("Size : " + map.size());
		
	//verify(pulisrer,time(1)).add();
	}
	
}