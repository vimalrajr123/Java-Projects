package com.java.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Hashset {

	public static void main(String[] args) {
		
		
		HashSet<String> s = new HashSet<>();
		s.add("123");
		s.add("123");
		s.add(null);
		s.add("543");
		s.add(null);
		
		System.out.println("HashSet : " + s);
		
		Collections.synchronizedSet(s);
		
		System.out.println("SynChrSet : " + s);
		
		
		TreeSet<String> t = new TreeSet<>();
		t.add("123");
		t.add("123");
	//	t.add(null);// Showing null pointer exception. no null values allowed for tree
		t.add("aa");
		t.add("AA");
	//	t.add(null);//
		
		System.out.println("Treeset : " + t);
		
		
		
		HashSet<String> s1 = new LinkedHashSet<>();
		s1.add("123");
		s1.add("123");
		s1.add(null);
		s1.add("543");
		s1.add(null);
		
		System.out.println("LinkedHashSet : " + s1);
		
		int i = 71;
		String str = Character.toString((char) i);
		System.out.println("String : " + str);

		
		char c='M';
		int in = (int)c;

		char b = (char) in;
		System.out.println("dum : " + b);
		System.out.println("Integer : " + in);

		/*
		 * select * from (select *, row_number() over (order by salary desc) as row_num
		 * from employee) where row_num =3;
		 */
		
	//	Set<String> set = new CopyOnWriteArraySet<>();
		Set<String> set = new HashSet<>();
	//	List<String> set = new ArrayList<>();
		
		set.add("123");
		set.add("123");
		set.add(null);
		set.add("543");
		set.add(null);
		
		for(String strr: set) {
			
			if(strr == "543") {
				set.add("999");
			}
			if(strr == "543") {
				set.remove("123");
			}
			
		}
		System.out.println("CopyOnWriteArraySet : " + set);
		

		
	}

}
