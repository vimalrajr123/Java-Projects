package com.java.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapHascodeAndEquals {

	public static void main(String[] args) {

		Employee s1 = new Employee(1, 11, 111);
		Employee s2 = new Employee(2, 22, 222);
		Employee s3 = new Employee(3, 33, 333);
		Employee s4 = new Employee(2, 22, 222);
		Employee s5 = new Employee(3, 33, 333);

		Map<Employee, Integer> map = new HashMap<>();
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 3);
		map.put(s4, 4);
		map.put(s5, 5);
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("First", 1);
		map1.put("Abc",2);
		map1.put("Zee", 3);
		map1.put("Long", 4);
		map1.put("Beet",4);
		/*
		 * Map<String,Integer> result2 =
		 * map1.entrySet().stream().sorted(Map.Entry.comparingByKey())
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		 * //(OValue,NValue) -> LinkedHashMap::new, NValue)); (oldValue, newValue) ->
		 * LinkedHashMap::new , newValue));
		 */
		
		/*
		 * map1.entrySet().stream().sorted(Map.Entry.comparingByKey()) .forEachOrdered(s
		 * -> System.out.println(s.getKey() + " " + s.getValue()));
		 */		
	List<String> ll = new ArrayList<>();
	
	Set<String> setResult = ll.stream().collect(Collectors.toSet());
	
	Set<String> ss = new HashSet<>(ll);
	
	Set<String> ss1 = map1.keySet()
			.stream().collect(Collectors.toSet());
	
	Set<Integer> ss11 = map1.values()
			.stream().collect(Collectors.toSet());
	
	Set<String> ss112 = map1.values()
			.stream()
			.map(p -> p.toString())
			.collect(Collectors.toSet());
	
	System.out.println("Set : " + ss1 + " "+ ss11 + " " + ss112);
		
		Map<String, Integer> values= map1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		Map<String, Integer> keys= map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ,
                       (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		Map<String, Integer> org = map1.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue(),
						(oldV,newV)-> oldV,LinkedHashMap::new  ));
		
		System.out.println("ComparingByValue1 : " + values);
		System.out.println("ComparingByKey1 : " + keys);
		
	//	System.out.println("ComparingByValue : " + result);
		
	//	System.out.println("ComparingByKey : " + result2);
				
		
	/*
	 * Map result = map.entrySet().stream()
	 * .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue,
	 * newValue) -> oldValue, LinkedHashMap::new));
	 */

		for (Entry<Employee, Integer> e : map.entrySet()) {
			Employee emp = e.getKey();
			int val = e.getValue();
			System.out.println(emp.age + ":" + emp.id + ":" + emp.salary + " - " +val);
		}
		
		
		
		/// 
		
		Iterator<Entry<Employee, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			
			Entry<Employee, Integer> entry = iterator.next();
			
		//	entry.setValue(6);
			
			if(entry.getValue() == 4) {
				entry.setValue(6);
			}
			
			if(entry.getValue() == 1) {
				iterator.remove();
			}
			
			
			
		}
		System.out.println("************************************8");
		
		for (Entry<Employee, Integer> e : map.entrySet()) {
			Employee emp = e.getKey();
			int val = e.getValue();
			System.out.println(emp.age + ":" + emp.id + ":" + emp.salary + " - " +val);
		}
		
		
		
	}
}
