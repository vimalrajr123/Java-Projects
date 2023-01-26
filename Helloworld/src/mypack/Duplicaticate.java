package mypack;

import java.util.HashMap;
import java.util.Map;

public class Duplicaticate {
	
	public static void main(String[] args)   {
		 
		 
		// String str  = "aaabbbddhnnehhiiaak";
		
		 
		 int jj = 567090;
		 String str = String.valueOf(jj);
		 
		 int n = str.length();
		
		char[] ch = str.toCharArray();
		//int count = 1;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: ch) {
			
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count+1);
				
			}
			else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue() );
		}
		 
	 }


}
