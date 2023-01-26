package com.java.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Map<Integer, String> map = new HashMap<>();
		
		map.put(null, null);
		map.put(3, "Three");
		map.put(2, null);
		map.put(1, null);
		
		System.out.println("HashMap : " +map); // one null key, Multiple null value
		
		Collections.synchronizedMap(map);		
		System.out.println("SynchronizedMap : " + map); // one null key, Multiple null value
		
		Map<Integer, String> map1 = new Hashtable<>();
		
		map1.put(4, "Four");
		map1.put(3, "Three");
	//	map1.put(2, null); // showing null pointer exception
	//	map1.put(null, null);
		
		System.out.println("HashTable : " + map1); // no null key and no null value
		
		
		
		Map<Integer, String> map2 = new ConcurrentHashMap<Integer, String>();
		
		map2.put(4, "Four");
		map2.put(3, "Three");
	//	map2.put(2, null); // showing null pointer exception
	//	map2.put(null, null);
		
		System.out.println("Concurrent HashMap : " + map2); // no null key and no null value
		
		
		Map<Integer, String> map3 = new TreeMap<Integer, String>();
		
		map3.put(4, "Four");
		map3.put(3, "Three");
		map3.put(2, null); 
		//map3.put(null, null); // showing null pointer exception only for null key not for value
		
		System.out.println("Tree Map : " + map3);
		
		
		Map<Integer, String> map4 = new LinkedHashMap<Integer, String>();
		
		map4.put(4, "Four");
		map4.put(3, "Three");
		map4.put(2, null); 
		map4.put(null, null); // allow null key nad null value
		
		System.out.println("Linked Map : " + map4);

	}

}
