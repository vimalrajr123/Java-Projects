package com.java.secondround;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 153;
		
		int num = n;
		boolean arm = false;
		int mod, reminder = 0;
		
		
		
		if(n<=9 && n>0) {
			//arm = true
			System.out.println(arm=true);
		}
		else {
		while(n>0) {
			
			mod = n%10;
			reminder +=  Math.pow(mod,3);
			n=n/10;
			
		}
				
		if(num == reminder) {
			arm = true;
		}
		
		System.out.println(arm);
		}

	}

}
