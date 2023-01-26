package InterviewOwnpreparation2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Samplee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "ServiceId";
		
		Map<Integer,String> hashmap = new HashMap();
		hashmap.put(1,"OrderNumber");
		hashmap.put(3,"ServiceId");
		hashmap.put(2,"AOrderVersion");
		
	//Map<String,String> output = map.entrySet().stream().filter(eee -> name.equalsIgnoreCase(eee.getKey()))
	//	.collect(Collectors.toMap(eee -> eee.getKey()., eee -> eee.getValue())); 	
		
		
		   Map<Integer, String> output = hashmap.entrySet()
			         .stream()
			         .filter(p -> p.getKey().intValue() <= 2) //filter by key
			         .filter(map -> map.getValue().startsWith("A")) //filter by value
			         .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		   
		   
	/*	
		List<String> output = hashmap
		         .stream()
		         .filter(p -> p.getKey().intValue() <= 2) //filter by key
		         .filter(map -> map.getValue().startsWith("A"));//filter by value
		         .collect(Collectors.toList()));*/
		         
		         

List<String> valueList = hashmap.values().stream().filter(p -> p.toString().equals("OrderNumber"))
.collect(Collectors.toList()); 

		/*  Map<Integer, String> result = hashmap.entrySet() 
		          .stream() 
		          .filter(map -> map.getKey().intValue() <= 22) 
		          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  */

System.out.println("valueList" + valueList);
System.out.println("Values" + output);

//valueList.foreach(m -> Syso);

for(Map.Entry<Integer,String> i  : output.entrySet())
{
	System.out.println("Values" + i.getValue() + i.getKey());
}
		
		/*List<ManifestAttribute> attributes = new ArrayList<>();
		ManifestAttribute atrr2 = new ManifestAttribute();
		atrr2.setName("ServiceId");
		atrr2.setValue("1222221");
		ManifestAttribute atrr1 = new ManifestAttribute();
		atrr1.setName("ServiceId1");
		atrr1.setValue("131");
		ManifestAttribute atrr = new ManifestAttribute();
		atrr.setName("ServiceId2");
		atrr.setValue("113");
		attributes.add(atrr);
		attributes.add(atrr1);
		attributes.add(atrr2);
		
		
		ManifestAttribute matched = attributes.stream()
				.filter(eee -> name.equalsIgnoreCase(eee.getName()))
				.findAny().
				orElse(null);
		
		System.out.println("Value  "+matched.getValue());*/
		
//*************************************************		
		/* List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		    System.out.println("original list: " + numbers);
		    List<Integer> even = numbers.stream()
		                                .map(s -> Integer.valueOf(s))
		                                .filter(number -> number % 2 == 0)
		                                .collect(Collectors.toList());
		    System.out.println("processed list, only even numbers: " + even);*/
		
		
	/*	Map<String,String> map = new HashMap();
		map.put("OrderNumber", "121");
		map.put("ServiceId", "11");
		map.put("OrderVersion", "101");
		
		
		System.out.println("Value  "+ map.remove("OrderNumber"));
		System.out.println("Value  "+ map.keySet());
		
		Map<String,String> output = map.entrySet().stream().filter(eee -> name.equalsIgnoreCase(eee.getKey()))
				.collect(Collectors.toMap(eee -> eee.getKey()., eee -> eee.getValue()));  
		
		System.out.println("Value  "+output.values());*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
