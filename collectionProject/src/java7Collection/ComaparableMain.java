package java7Collection;

import java.util.*;

public class ComaparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentComparable s1 = new StudentComparable(200, "vimal",30000);
		StudentComparable s2 = new StudentComparable(300, "raj",50000);
		StudentComparable s3 = new StudentComparable(500, "dhivya",20000);
		StudentComparable s4 = new StudentComparable(500, "dhivya",20000);
		StudentComparable s5 = new StudentComparable(100, "atharva",40000);
		
		List<StudentComparable> studentList =  new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println("******default List*****");
		
		for(StudentComparable s:studentList){
			System.out.println(s);
		}
		
		System.out.println("******Sorted List*****");
		
		Collections.sort(studentList);
		
		for(StudentComparable n:studentList) {
			System.out.println(n);
		}
		
		
		
		
		
		

	}

}
