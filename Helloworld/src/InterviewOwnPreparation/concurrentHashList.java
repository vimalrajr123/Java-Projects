package InterviewOwnPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentHashList {

	public static void main(String[] args) {
		
		  List<String> list = new CopyOnWriteArrayList<>(); list.add("11");
		  list.add("r11"); list.add("11e");
		  
		  
		  Iterator<String> itr = list.iterator();
		  
		  while(itr.hasNext()) { String value = itr.next();
		  
		  System.out.println("List Value:"+value);
		  
		  if(value.equals("r11")) {
		  
		  list.add("tttt"); }
		  
		  
		  }
		 
		
		Map<String,String> map = new ConcurrentHashMap<>();
		
		map.put("1", "one");
		map.put("3", "three");
		map.put("2", "two");
		map.put("4", "four");
		Collections.synchronizedMap(map);
		
		for(Entry<String,String> entry :  map.entrySet())
		{
			if(entry.getKey().equals("3"))
			{
				map.remove(entry.getKey());
				//map.get(key);
				System.out.println("removed" + entry.getKey() + entry.getValue());
			}else {
			System.out.println("unremoved" + entry.getKey() + entry.getValue());
			}
			
		}
	//	Collections.synchronizedMap(map);
		
	/*
	 * Iterator<String> itr = map.keySet().iterator();
	 * 
	 * 
	 * while(itr.hasNext()) { String key= itr.next();
	 * 
	 * if(key.equals("1")) { map.remove(key); System.out.println("removed" + key +
	 * map.values()); }
	 * 
	 * }
	 */
		
		
		}
		
	

}
