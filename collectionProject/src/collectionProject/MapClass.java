package collectionProject;
import java.util.*;
import java.util.Map.Entry;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Vimalraj");
		m.put(2,"Dhivya");
		m.put(3, "Vimala");
		m.put(4,"Raju");
		m.put(4,"dsf");
		new MapClass().printMap(m);
		
	}
	
	void printMap(Map<Integer, String> m) {
		
		
		for(Entry<Integer, String> e: m.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		
		
	}

}
