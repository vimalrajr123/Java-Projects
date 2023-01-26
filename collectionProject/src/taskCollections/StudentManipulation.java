package taskCollections;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManipulation implements StudentInterface {
	
	static Map<Integer, StudentDTO> nonStaticMap1 = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentDTO s1= new StudentDTO(100,"vimal",36,180000,"Lead");
		StudentDTO s2= new StudentDTO(300,"raj",40,10000,"Developer");
		StudentDTO s3= new StudentDTO(400,"dhivya",36,10000,"Lead");
		StudentDTO s4= new StudentDTO(500,"raju",60,10000,"Manager");
		StudentDTO s5= new StudentDTO(200,"vimala",56,180000,"Manager");
		StudentDTO s6= new StudentDTO(600,"atharva",1,10000,"Developer");

		Map<Integer, StudentDTO> nonStaticMap = new HashMap<>();
		nonStaticMap.put(1, s1);
		nonStaticMap.put(2, s2);
		nonStaticMap.put(3, s3);
		nonStaticMap.put(4, s4);
		nonStaticMap.put(5, s5);
		nonStaticMap.put(6, s6);
		
		
		nonStaticMap1.put(1, s1);
		nonStaticMap1.put(2, s2);
		nonStaticMap1.put(3, s3);
		nonStaticMap1.put(4, s4);
		nonStaticMap1.put(5, s5);
		nonStaticMap1.put(6, s6);
		StudentManipulation studentMain = new StudentManipulation();
		studentMain.getNonStaticMap(nonStaticMap);	
		StudentManipulation.getSecondMap(nonStaticMap);
		
	}
	
	
	static void getSecondMap(Map<Integer, StudentDTO> m2) {
		
		List<String> greaterAge = m2.values()
									.stream()
									.filter(s -> s.getAge()>35)
									.sorted(Comparator.comparing(StudentDTO::getName).reversed())
									.map(s -> s.getName())
									.collect(Collectors.toList());
		
		System.out.println(greaterAge);
		
		Map<Integer, StudentDTO> getSalary = m2.entrySet()
											.stream()
											.filter(s -> s.getValue().getSalary()>70000)
											.filter(s -> s.getValue().getDesig()=="Lead")
											.collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue()));
		System.out.println(getSalary);
		
	}


	

	
	@Override
	public void getNonStaticMap(Map<Integer, StudentDTO> m1) {
		
		List<String> displayNames = m1.values()
				.stream()
				.filter(s ->s.getDesig()!="Lead")
				.filter(s ->s.getDesig()!="Manager")
				.sorted(Comparator.comparing(StudentDTO::getName))
				.map(s ->s.getName())
				.collect(Collectors.toList());
		
		displayNames.forEach((n) -> System.out.println(n));
		
		Map<Integer,String> displayMap = m1.values()
				.stream()
				.filter(s ->s.getAge()<14)
				.collect(Collectors.toMap(StudentDTO::getAge,StudentDTO::getName));
		
		System.out.println("DisplayMap age less than 14 :"+displayMap);
		
	
		
		
	}
	@Override
	public void getStaticDetails(Map<Integer, StudentDTO> m1) {
		// TODO Auto-generated method stub
		
	}


}
