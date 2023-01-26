package com.java.secondround;

import java.util.*;

public class SetCheckingHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StrudentTab s = new StrudentTab("First",1);
		StrudentTab s1 = new StrudentTab("Second",2);
		StrudentTab s2 = new StrudentTab("Third",3);
		StrudentTab s3 = new StrudentTab("Second",2);
		StrudentTab s4 = new StrudentTab("Fourth",5);
		
		Set<StrudentTab> set = new HashSet<>();
		set.add(s);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		set.forEach(s11 -> System.out.println(s11));
		
		

	}

}
