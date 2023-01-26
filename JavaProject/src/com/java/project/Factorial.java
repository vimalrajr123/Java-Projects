package com.java.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		int f= 1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		
		System.out.println(f);
		
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(3);
		set.add(3);
		set.add(1);
		set.add(4);
		
		
		System.out.println("Before : " + set);
		
		ArrayList<Integer> arr = new ArrayList<>(set);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("After " + arr);
	}

}
