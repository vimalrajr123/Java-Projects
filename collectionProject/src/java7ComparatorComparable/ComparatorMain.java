package java7ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentComparator s1 = new StudentComparator(200, "vimal",30000);
		StudentComparator s2 = new StudentComparator(300, "raj",50000);
		StudentComparator s6 = new StudentComparator(500, "dhivya",5000);
		StudentComparator s3 = new StudentComparator(500, "dhivya",20000);
		StudentComparator s4 = new StudentComparator(500, "dhivya",1000);
		StudentComparator s5 = new StudentComparator(100, "atharva",40000);
		
		List<StudentComparator> studentList =  new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
		System.out.println("******default List*****");
		
		for(StudentComparator s:studentList){
			System.out.println(s);
		}
		
		
		System.out.println("******sorted by Salary List*****");
		
		Collections.sort(studentList, new SalaryComparator());
		
		
		for(StudentComparator v:studentList){
			System.out.println(v);
		}
		
		System.out.println("******sorted by id List*****");
		
		Collections.sort(studentList, new IdComparator());
		
		
		for(StudentComparator s:studentList){
			System.out.println(s);
		}
		
		
		System.out.println("******sorted by Name List*****");
		
		Collections.sort(studentList, new NameComparator());
		
		
		for(StudentComparator s:studentList){
			System.out.println(s);
		}
		
		
		
		
		

	}

}
