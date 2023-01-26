package mypack;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 * double a = s.nextInt(); double b = s.nextInt();
		 * 
		 * double c = a / b;
		 * 
		 * String str = String.valueOf(c); String[] strArray = new String[2]; strArray =
		 * str.split("\\.");
		 * 
		 * for(String ss : strArray){ System.out.println(ss);
		 * 
		 * 
		 * }
		 * 
		 * double c =
		 */  
		int a = 10;
		int b = 3;
		double d = a/b;//2.333333;
		//System.out.println("hh   " + d);
		
		DecimalFormat test = new DecimalFormat("##0.0");
		    String str = test.format(d);
		    System.out.println(str);
		    String str2 = str.substring(str.length() - 1);
		    str = str.substring(0, str.length() - 1);

		    if(str2.equals("0")){
		    //	System.out.println(Integer.valueOf(d));
		    	}else{
		    	System.out.println(str + '(' + str2 + ')');
		    	}
		   // System.out.println(str + '(' + str2 + ')');
}
}
