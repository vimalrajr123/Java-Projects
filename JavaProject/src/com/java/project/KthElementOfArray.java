package com.java.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input:0 1 0 1 1 1 1 0 0 1 k=3 output: null
		 //input:9 3 2 7 2 5 3 6     k=4 output: 7
		
		
		//int[] array = {0,1,0,1,1,1,1,0,0,1};
		Integer[] array = {9,3,2,7,2,5,3,6};
		
		
		//List<int[]> list = Arrays.asList(array);
		
		//System.out.println(list.size());
		
		//List<Integer> list = Arrays.asList(array);
		
		//System.out.println(list.size());
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);
		int k = 3;
		
		/*
		 * List<Integer> list = new ArrayList<>(); list.add(9); list.add(3);
		 * list.add(2); list.add(7); list.add(2); list.add(5); list.add(3); list.add(6);
		 * int k = 4;
		 */
		
		Collections.sort(list);
		
		Set<Integer> set = new HashSet<>(list);
	//	set.addAll(list);
		
		if(k <= set.size() ) {
			System.out.println(new ArrayList<>(set).get(k));
		}
		else {
			System.out.println("null");
		}
		
		
		
	}
}
		
		
		
		
		
		