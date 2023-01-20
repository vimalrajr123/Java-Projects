package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaListFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<LamdaStudent> studentList = new ArrayList<>();
		LamdaStudent student1 = new LamdaStudent(100, "Vimal", 10000);
		LamdaStudent student2 = new LamdaStudent(300, "raj", 40000);
		LamdaStudent student3 = new LamdaStudent(400, "Dhivya", 500);
		LamdaStudent student4 = new LamdaStudent(200, "Atharva", 400);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		System.out.println("****List Details*****");
		studentList.forEach(
				n -> System.out.println(n.getId()+" "+n.getName()+" "+n.getSalary())
				);
		
		System.out.println("*********************");
		
		System.out.println("****Filtered Salary*****");
		
		//without void
		studentList.stream()
					.filter(s -> s.getSalary()>500)
					.forEach(s -> System.out.println(s.getSalary()));
		
		System.out.println("*********Count***********");
				long count=studentList.stream()
							.filter(s -> s.getSalary()>500)
							.count();
		System.out.println(count);
		
		System.out.println("*******Filtered List*************");
		
		//filtered to List
		List<LamdaStudent> filteredStudentList = studentList.stream()
														.filter(s -> s.getSalary()>500)
														.collect(Collectors.toList());
		
		System.out.println("filteredStudentList "+filteredStudentList);
		
		
		System.out.println("*******Filtered Set*************");
		
		//filtered to Set
		Set<LamdaStudent> filteredStudentSet = studentList.stream()
														.filter(s -> s.getSalary()>500)
														.collect(Collectors.toSet());
		
		System.out.println("filteredStudentSet "+filteredStudentSet);
		
		System.out.println("*******Filtered Map*************");
		//filtered to Map
		Map<Integer,String> filteredStudentMap = studentList.stream()
																.filter(s -> s.getSalary()>500)
																//.map(s ->s.getId())
																.collect(Collectors.toMap(LamdaStudent::getId, LamdaStudent::getName));
		
		System.out.println("filteredStudentMap "+filteredStudentMap);
		

	}

}
