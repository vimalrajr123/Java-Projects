package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class java8MulOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Multiple of 5 in java 8
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.stream().forEach(s -> System.out.println(s*5));
		
		System.out.println("**************************");
		
		
		//2. String = "India is my cpountry"  -> print count of i in java 8
		
		
		String s = "India is my country";
		
		long count = s.chars().filter(ch -> ch == 'i').count();		
		System.out.println(count);
		
		System.out.println("*************************");
		
		//3. consecutive number
		
		int num = 1231; 
		
		String s1 = String.valueOf(num);
		String[] strArr = s1.split("");
		
		boolean consec = true;
		for(int i=1;i<strArr.length;i++) {
			
			if(!(Integer.valueOf(strArr[i]) - Integer.valueOf(strArr[i-1]) == 1)) {
			  consec = false;
			  break;
			}
			
		}
		
		if(consec) {
			System.out.println("Consecutive");
		}
		else {
			System.out.println("Not Consecutive");
		}
		

	}

}
