package collectionProject;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new TreeMap<>();
		Map<Integer, String> H = new Hashtable<>();
		
		m.put(1, "Vimal");
		m.put(2, "raj");
		m.put(3, "Dhivya");
		m.put(4, null);
		m.put(5, null);
		m.put(6, "qqqq");
		m.put(6, "dsd");
		m.remove(1);
		
		H.put(1, "Vimal");
		H.put(2, "raj");
		H.put(3, "Dhivya");
		H.put(6, "qqqq");
		H.put(6, "dsd");


		new TreeMapClass().printMap(m);
		new TreeMapClass().printMap(H);
		
		
		

	}
	void printMap(Map<Integer, String> m) {
		for(Entry<Integer, String> e: m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
