package lambda;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;

public class LamdaPracticals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,LamdaStudent> map = new HashMap<>();
		LamdaStudent student1 = new LamdaStudent(100, "Vimal", 10000);
		LamdaStudent student2 = new LamdaStudent(300, "raj", 40000);
		LamdaStudent student3 = new LamdaStudent(400, "Dhivya", 500);
		LamdaStudent student4 = new LamdaStudent(200, "ram", 400);
		
		map.put(1, student1);
		map.put(2, student2);
		map.put(3, student3);
		map.put(4, student4);
		
		List<LamdaStudent> namesList = map.values()
											.stream()
											.filter( s -> s.getName().startsWith("r") ) 
											.collect(Collectors.toList());
		
		System.out.println("namesList : "+namesList);
		
		
		Set<Integer> keysSets = map.keySet()
										.stream()
										.filter(s -> s>2)
										.collect(Collectors.toSet());
		
		System.out.println("Keys set : "+keysSets);
	
		
		Set<LamdaStudent> setRecord = map.entrySet()
										.stream()
										.filter(s -> s.getKey()>2)
										.map(t -> t.getValue())
										.collect(Collectors.toSet());
		
		System.out.println("Value set : "+setRecord);
		
		

	}

}
