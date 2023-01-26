package InterviewOwnPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfWordInString {

	public static void main(String[] args) {
		String str = "geek is a geek for a geek of word";

		String[] arr = str.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String s : arr) {

			if (map.containsKey(s)) {
				
				map.put(s, map.get(s)+1);

			} else {

				map.put(s,1);
			}

		}
		
		for(Entry<String, Integer> entry:map.entrySet()) {
	//	System.out.println("DUP count : "+entry.getValue()+" DUP value : "+entry.getKey());		
		System.out.println(entry.getKey()+" "+entry.getValue());

	}
}
}
