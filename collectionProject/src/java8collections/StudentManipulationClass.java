package java8collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentManipulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student emp1 = new Student(1, "vimal", 28, 10000);
		Student emp2 = new Student(5, "dhivya", 28, 30000);
		Student emp3 = new Student(3, "aaa", 30, 20000);
		Student emp4 = new Student(2, "vimal", 21, 30000);
		Student emp5 = new Student(4, "ccc", 19, 40000);
		Student emp6 = new Student(6, "ccc", 14, 7000);
		Student emp7 = new Student(7, "ccc", 12, 400);
		
		List<Student> e = new ArrayList<>();
		
		e.add(emp5);
		e.add(emp4);
		e.add(emp1);
		e.add(emp3);
		e.add(emp2);
		e.add(emp6);
		e.add(emp7);
		
		Comparator<Student> nameCmp = Comparator.comparing(Student::getName).thenComparing(Student::getSalary);
		
		Collections.sort(e,nameCmp);
		for(Student s: e) {
			System.out.println(s.toString());
			//System.out.println(s.getName()+" "+s.getAge()+" "+s.getSalary());
		}
		System.out.println("*********");
		
		
		//for each java 8 feature
		e.forEach(element->System.out.println(element));

	}

}
