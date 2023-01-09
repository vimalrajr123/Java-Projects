package Task2;

import java.util.*;


public class EmployeeManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1, "vimal", 28, 10000);
		Employee emp2 = new Employee(5, "Dhivya", 28, 30000);
		Employee emp3 = new Employee(3, "aaa", 30, 20000);
		Employee emp4 = new Employee(2, "bbb", 21, 30000);
		Employee emp5 = new Employee(4, "ccc", 19, 40000);
		
		List<Employee> e = new ArrayList<>();

		
		e.add(emp5);
		e.add(emp4);
		e.add(emp1);
		e.add(emp3);
		e.add(emp2);
		
		//
		for(Employee s: e) {
			System.out.println(s.toString());
			//System.out.println(s.getName()+" "+s.getAge()+" "+s.getSalary());
		}
		System.out.println("*********");
		
		Collections.sort(e);
		for(Employee s: e) {
			System.out.println(s.toString());
			//System.out.println(s.getName()+" "+s.getAge()+" "+s.getSalary());
		}
		
	}
}


