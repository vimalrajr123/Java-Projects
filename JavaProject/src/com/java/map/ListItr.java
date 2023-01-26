package com.java.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListItr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome");
		
		List<String> l = new ArrayList<>();
		l.add("EE");
		l.add("E");
		l.add("ABC");
		String n="E";
		Collections.sort(l,Comparator.reverseOrder());
		ListIterator<String> itr1 = l.listIterator();
		ListIterator<String> itr = l.listIterator(l.size());
		Iterator in = l.iterator();
		while(in.hasNext()) { // only hasnext, prev not there
			
		}
		
		
		Vector<Integer> v = new Vector();
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			
			e.nextElement();
		}
		
		
		if(l.contains(n)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	/*	while(itr1.hasNext()) {
		System.out.println("1:  " +itr1.next());	
		}
		
		while(itr1.hasPrevious()) {
			System.out.println("2:  " +itr1.previous());	
			}
		
		
		*/
			
		
		

	}
}