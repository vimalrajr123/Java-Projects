package lambda;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;

public class LamdaPracticalsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,LamdaStudent> map = new HashMap<>();
		LamdaStudent student1 = new LamdaStudent(100, "vimal", 10000);
		LamdaStudent student2 = new LamdaStudent(300, "raj", 40000);
		LamdaStudent student3 = new LamdaStudent(400, "dhivya", 500);
		LamdaStudent student4 = new LamdaStudent(200, "ram", 400);
		LamdaStudent student5 = new LamdaStudent(100, "vimal", 10000);
		LamdaStudent student6 = new LamdaStudent(300, "raj", 40000);
		map.put(1, student1);
		map.put(2, student2);
		map.put(3, student3);
		map.put(4, student4);
		map.put(5, student5);
		map.put(6, student6);
		
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
		
		
		
		
		
		
		
		
		// get the name with "I" 
		//salary >1005 
		//sort with ID
		
		//Map<Integer,LamdaStudent> map = new HashMap<>();
		
		List<Integer> namesWithI = map.values()
				.stream()
				.filter(s ->s.getName().contains("i"))
				.filter(s ->s.getSalary() > 1005)
				.sorted(Comparator.comparing(LamdaStudent::getId))
				.map(s->s.getId())
				.collect(Collectors.toList());
		
		System.out.println("namesWithI:"+namesWithI);
		
		List<Integer> namesWithKey = map.entrySet()
				.stream()
				.filter(s ->s.getValue().getName().contains("i"))
				.filter(s ->s.getValue().getSalary() > 1005)
				//.sorted(Comparator.comparing(LamdaStudent::getId))
				.map(s->s.getKey())
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("namesWithKey:"+namesWithKey);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
