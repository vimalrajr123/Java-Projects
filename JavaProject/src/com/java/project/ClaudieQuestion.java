package com.java.project;

public class ClaudieQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,4};
		 int n= arr.length;
		 
		 int[] left = new int[n];
		 int[] right = new int[n];
		 int[] prod = new int[n];
		 
		 
		 left[0] = 1;
		 right[n-1] = 1;
		 
		 
		 for(int i=1;i<n;i++) {
			left[i]  = left[i-1]*arr[i-1];
		 }
		 
		 for(int j=n-2;j>=0;j--) {
			 right[j]  = right[j+1]*arr[j+1];
		 }
		 
		 for(int i=0;i<n;i++) {
			 System.out.println(prod[i] = left[i] * right[i]);
		 }

	}

}
