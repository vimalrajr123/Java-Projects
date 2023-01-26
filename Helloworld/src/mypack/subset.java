package mypack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int[] array = { 3,9,9,5}; int len = array.length; String t = ""; for(int
		  i=0;i<len;i++) { t=t+array[i]; }
		 
		 
		  
		  
		
		//  String t = "FUNN"; int len = t.length();
		 
		int temp = 0;
		

		String[] str = new String[len * (len + 1) / 2];

			  Set<String> ff = new HashSet<>();
			  
		
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {

				str[temp] = t.substring(i, j + 1);
				ff.add(str[temp]);
				temp++;

			}
		}
		
		

		for (String ss : ff) {
			System.out.println(ss);
		}

		

		/*
		 * for(int i=0;i<str.length;i++) { System.out.println(str[i]); }
		 */
	}

}
