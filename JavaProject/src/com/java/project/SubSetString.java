package com.java.project;

import java.util.HashSet;
import java.util.Set;

public class SubSetString {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aaahytggaba";
		String[] array = new String[s1.length()];
		Set<String> set = new HashSet<>();
		for(int i=0;i<array.length;i++) {			
			for(int j=i;j<array.length;j++) {
				String s = s1.substring(i,j+1);
				if(s.length()>1) {
				verify(s,set);
				}
				
			}
		}
		
		set.forEach(s -> System.out.println(s));

	}
	private static void verify(String s, Set set) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder(s);
		String rev = builder.reverse().toString();
		if(rev.equals(s)) {
			count ++;
			//System.out.print(s + " ");
			set.add(s);
		}
		
	}

}
