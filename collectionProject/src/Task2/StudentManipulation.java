package Task2;

import java.util.*;


public class StudentManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student emp1 = new Student(1, "vimal", 28, 10000);
		Student emp2 = new Student(5, "Dhivya", 28, 30000);
		Student emp3 = new Student(3, "aaa", 30, 20000);
		Student emp4 = new Student(2, "bbb", 21, 30000);
		Student emp5 = new Student(4, "ccc", 19, 40000);
		
		List<Student> e = new ArrayList<>();
		
		e.add(emp5);
		e.add(emp4);
		e.add(emp1);
		e.add(emp3);
		e.add(emp2);
		
		//
		for(Student s: e) {
			System.out.println(s.toString());
			//System.out.println(s.getName()+" "+s.getAge()+" "+s.getSalary());
		}
		System.out.println("*********");
		Collections.sort(e,new StudentNameComparator());
		
		
		
		for(Student s: e) {
			System.out.println(s.toString());
			//System.out.println(s.getName()+" "+s.getAge()+" "+s.getSalary());
		}
		System.out.println("*********");
		Collections.sort(e,new StudentSalaryComparator());
		for(Student s: e) {
			System.out.println(s.toString());
			//System.out.println(s.getName()+" "+s.getAge()+" "+s.getSalary());
		}
		

		
	}
}


