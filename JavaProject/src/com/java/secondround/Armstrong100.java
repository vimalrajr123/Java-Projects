package com.java.secondround;

public class Armstrong100 {

	public static void main(String[] args) {

		int mod;
		//int num =0;

		int count = 500;
		
		for (int n = 1; n <= count; n++) {
			int num = n;
			if (n <= 9) {
				// arm = true
				System.out.println(n);
			} else {
				int reminder = 0;
				while (num > 0) {
					mod = num % 10;
					reminder += Math.pow(mod, 3);
					num = num / 10;
				}
				
				if (n == reminder) {
					System.out.println(n);
				}
			}
				

		}

	}

}
