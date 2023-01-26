package com.java.secondround;

public class ArmStrongOwn100 {

	public static void main(String[] args) {
		
		
		int count = 200;
		
		
		for(int i=1;i<=count;i++) {
			int num = i;
			
			if(i<=9) {
				System.out.println(i);
			}else {
				int reminder = 0;
				while(num>0) {
					int mod = num%10;
					reminder +=  Math.pow(mod, 3);
					num = num/10;				
				}
				
				if(i==reminder) {
				System.out.println(i);	
				}
				
			}
			
			
			
		}
		// TODO Auto-generated method stub

	}

}
