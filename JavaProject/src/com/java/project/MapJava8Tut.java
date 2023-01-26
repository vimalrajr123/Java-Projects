package com.java.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapJava8Tut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee s1 = new Employee(1, 11, 111);
		Employee s2 = new Employee(2, 33, 222);
		Employee s3 = new Employee(3, 22, 333);
		/*
		 * Employee s4 = new Employee(2, 22, 222); Employee s5 = new Employee(3, 33,
		 * 333);
		 */

		Map<Employee, Integer> map = new HashMap<>();
		map.put(s1, 1);	
		map.put(s3, 3);
		map.put(s2, 2);
		/*
		 * map.put(s4, 4); map.put(s5, 5);
		 */

		
	long count = map.entrySet().stream().count();
	
	System.out.println("Counting" + count);
	
	
	map.entrySet().stream().filter(p -> p.getKey().equals(s2)).count();
	
	int countAll = map.entrySet().stream().collect(Collectors.summingInt(p -> p.getValue()));
	
	
	
	
	  map.entrySet() .stream()
	  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) .forEach(p ->
	  System.out.println(p));
	 
 
 
  map.entrySet().stream().map(p -> p.getKey()).forEach(s ->System.out.println(s.getId()) );
 //System.out.println("Age : " +e.getAge());
 
 Comparator<Employee> compareByName = Comparator
         .comparing(Employee::getId)
         .thenComparing(e -> e.getAge());
 
 List<Employee> lo = new ArrayList<>();
 lo.add(s1);
 lo.add(s3);
 lo.add(s2);
 
 lo.stream().sorted(Comparator.comparing(Employee::getId))
 .forEach(p -> System.out.println("Love : "+p));
 
 List<Employee> l = new ArrayList<>();
 l.add(s1);
 l.add(s3);
 l.add(s2);
 
 
 Collections.sort(l,compareByName);
 
 for(Employee e : l) {
 System.out.println("Comparator : " +e.age + " " + e.id + " " +e.salary );
 }
 
 
	}

}
