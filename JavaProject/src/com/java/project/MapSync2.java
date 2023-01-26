package com.java.project;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapSync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		map.put("Apple", "one");
		map.put("Beetroot", "two");
		map.put("Carrot", "three");
		map.put("Orange", "four");

		//Collections.synchronizedMap(map);
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {

			Entry<String, String> entry = iterator.next();

			// update
			entry.setValue("hjjkj");

			if (entry.getKey().equals("Carrot")) {
				iterator.remove();
			}

		}

		for (Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
