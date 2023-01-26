package com.java.project;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f1=0,f2=1;
		int f3;
		int n=6;
		System.out.print(f1 + " " + f2 + " ");
		for(int i=2;i<n;i++) {
			f3=f1+f2;
			System.out.print(f3 + " ");
			f1=f2;
			f2=f3;
		}

	}

}
