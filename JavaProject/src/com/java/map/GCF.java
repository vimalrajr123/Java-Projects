package com.java.map;

public class GCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HCF and LCM
		
		int temp, temp1,temp2;
		int num1 = 12,num2=24;
		int gcd =1;
		
		for(int i=1;i<=num1 && i<=num2 ; i++) {
			
			if(num1%i == 0 && num2%i == 0 ) {
				gcd = i;
			}
		}
		
		int hcf = gcd;
		int lcm = (num1*num2 ) /hcf;
		
		System.out.println(hcf + " " + lcm);

	}

}
