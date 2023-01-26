package com.java.project;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		Set<Entry<Integer, String>> set =  map.entrySet();
		//Collections.synchronizedMap(map);
		
		
		for(Entry<Integer, String> entry : map.entrySet()) {
		
			
			synchronized (entry.getKey()) {
			if(entry.getKey() == 3) {
				map.remove(3);
			}
			}
			
		}
		
		/*synchronized (map) {
			
			Iterator itr = set.iterator();
			
			while(itr.hasNext()) {
				
				System.out.println("Key : " + itr.next());
				map.remove(3);
			
		}*/
		
		/*
		 * synchronized(map.get(k)) 
		 * { map.get(k).notify();
		 *  map.remove(k); }
		 */
		
		}

	}


