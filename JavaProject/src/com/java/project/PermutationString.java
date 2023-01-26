package com.java.project;

public class PermutationString {
	
	 public boolean checkInclusion(String s1, String s2) {
		 
		 
		 
		 
			/*
			 * char[] b =a.toCharArray(); char ch; ch = b[i]; b[i] = b[j]; b[j] = ch; return
			 * String.valueOf(b);
			 */
		 
		 StringBuilder str = new StringBuilder(s2);
		 StringBuilder revStr = str.reverse();
		 
		 
		 if(s1.contains(revStr)) {
			 return true;
		 }
		 if(s1.contains(s2)) {
			return true;
		 }
		return false;
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
