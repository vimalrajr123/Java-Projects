package mypack;

import java.util.ArrayList;
import java.util.List;

public class Aaabbcddeffff {
	
	 public static void main(String[] args)   {
		 
		 
		 String str  = "aaabbbddhnnehhiiaal";
		 
		 for(int i=0;i<str.length();i++) {

			 boolean fc= true;
			 for(int j=0;j< str.length();j++){				 
				 if(str.charAt(i) == str.charAt(j) && i!=j) {
					 fc= false;
					 break;
				 }				 
			 }
			 
			 if(fc) {
				 System.out.println(str.charAt(i));
			 }
				 
				
		 }
		 
	 }

}
