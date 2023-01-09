package javatpoint;

import java.util.*;

public class GenericsLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList(); // java 6
		list.add(0);
		list.add(1L);
		
		
		
		List<String> list1 = new ArrayList<String>(); // java7
		list1.add("1233");
	//s	list1.add(1234);
		
		
		
		List<String> list2 = new ArrayList<>(); // java 8
		list2.add("sdjgjh");

	}

}
