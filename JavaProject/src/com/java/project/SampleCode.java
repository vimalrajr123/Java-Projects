package com.java.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	dpaste.org/qTFT
		
	/*
	 * Given an array, input, of n integers where n > 1, return an array, output,
	 * such that output[i] is equal to the product of all the elements of input
	 * except input[i]. ​ Example: Input: [1,2,3,4] Output: [24,12,8,6]
	 */
		
		
		int[] input = {2,2,2,4};
		
			
		//1224
		for(int i=0;i<input.length;i++) {
			int temp =1;
			for(int j=0;j<input.length;j++) {
				if(i!=j) {
				temp = temp * input[j];
				}
				
			}
			System.out.print(temp + " ");
			
			
			
		}
		

	}
	

}
