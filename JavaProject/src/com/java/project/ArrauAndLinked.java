package com.java.project;

import java.util.*;

public class ArrauAndLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = new ArrayList<>();
		list.add("Jack");
		list.add("beet");
		list.add("car");
		list.add("App");
		
		
		
		List<String> list1 = new LinkedList<>();
		list1.add("Jack");
		list1.add("beet");
		list1.add("car");
		list1.add("App");
		
		Stack<String> list2 = new Stack<>();
		list2.push("Jack");
		list2.push("beet");
		list2.push("car");
		list2.push("App");
		list2.push(null);
		list2.push("Yellow");
		list2.pop();
		list2.remove("car");
		
		Vector<String> list3 = new Vector<>();
		list3.add("Jack");
		list3.add("beet");
		list3.add("car");
		list3.add("App");
		list3.add("Yellow");
		
		System.out.println(list);
		System.out.println(list1);
		System.out.println("Stack : " +list2);
		System.out.println(list3);
		
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.pop();
		
		System.out.println("Deque : " +q);
		

	}

}
