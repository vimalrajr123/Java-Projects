package com.java.secondround;

import java.util.*;

public class StreamParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>  map = new HashMap();
		map.put("1", "first");
		map.put("2", "second");
		map.put("3", "third");
		map.put("4", "four");
		
		map.entrySet().parallelStream().forEach(s -> System.out.println(s.getKey()));
		
		map.entrySet().parallelStream().filter(s -> s.getKey().equals("3")).forEach(s -> System.out.println(s.getValue()));

		map.entrySet().parallelStream().forEachOrdered(s -> System.out.println(s.getKey()));
		
	}

}
