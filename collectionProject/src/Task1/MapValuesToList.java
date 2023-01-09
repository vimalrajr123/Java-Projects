package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapValuesToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m = new HashMap<>();
		List<String> v = new ArrayList<>();
		List<Integer> k = new ArrayList<>();
	
		m.put(5, "eee");
		m.put(2, "bbb");
		m.put(3, "ccc");
		m.put(4, "ddd");
		
		MapValuesToList min = new MapValuesToList();
//		min.seperateKeyValues(m, v, k);
//		min.displayValues(v);
//		min.displayKeys(k);
		
		for(String e:m.values()) {
			v.add(e);
		}
		Collections.reverse(v);;
		//Collections.sort(v);
		System.out.println(v);
		
		
	}
	
//	void seperateKeyValues(Map <Integer,String> line,List<String> v,List<Integer> k) {
//		for(Entry<Integer, String> e: line.entrySet()) {
//			v.add(e.getValue());
//			k.add(e.getKey());
//		}
//		for(Entry<Integer, String> e: line.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
//	}
//		
//	void displayValues(List<String> values) {
//		for(String v1:values) {
//			System.out.println(v1);
//		}
//		
//	}
//	
//		void displayKeys(List<Integer> Keys) {
//			for(Integer K1:Keys) {
//				System.out.println(K1);
//			}
//	}
		
	}
	

