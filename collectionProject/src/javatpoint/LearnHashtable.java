package javatpoint;

import java.util.*;
import java.util.Map.Entry;

public class LearnHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String> hashtable = new Hashtable<>();
		
		hashtable.put("a", "asdad");
		hashtable.put("b", "adada");
		//hashtable.put(null, null);    null pointer exception
		
		for(Entry<String,String> entry: hashtable.entrySet()) {
			System.out.println(entry.getKey()+"   "+ entry.getValue());
			hashtable.put("c", "fddfss");
			System.out.println(entry.getKey()+"   "+ entry.getValue());
		} 
		
		
		LearnHashtable hash = new LearnHashtable();
		
	}

}
