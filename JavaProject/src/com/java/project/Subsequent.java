package com.java.project;

public class Subsequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input: 21462675756 output: 214*6*2*67-5-7-56
		//input: 98676555533 output: 98*6765-5-5-5-3-3
		
		//String input = "21462675756";
		String input = "98676555533";
		
		String[] tt = input.split("");
		
		int[] intArray = new int[tt.length];
		for(int i=0;i<tt.length;i++) {
			intArray[i] = Integer.valueOf(tt[i]);		
		}
		System.out.print(intArray[0]);
		for(int i=1;i<intArray.length;i++) {
		if(intArray[i]%2 == 0) {
			if(intArray[i-1]%2 == 0 && intArray[i]%2 == 0) {
			System.out.print("*"+intArray[i]);
			}
			else {
				System.out.print(intArray[i]);
			}
		}else {
			if(!(intArray[i-1]%2 == 0) && !(intArray[i]%2 == 0)) {
				System.out.print("-"+intArray[i]);
				}
				else {
					System.out.print(intArray[i]);
				}
		}
		
		}
		
		

	}

}
