package com.java.map;

import java.util.Collections;
import java.util.*;

public class LCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		l.add(1);
		List<Integer> lis = Collections.unmodifiableList(l);
		
		l.add(2);
		
		lis.add(3);
		
		// concurrency map how it work, and why its better than syn block
		System.out.println(l);
	}

}
