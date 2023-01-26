package abijeeth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
class Employee{
	
	int id;
	int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	
	
}

public class Employeemin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,1000));
		list.add(new Employee(2,1660));
		list.add(new Employee(3,1060));
		
		
	 Employee k = list.stream().min(Comparator.comparing(Employee:: getSalary)).get();
		
		
		
	//	int h =Collections.min(s);
		
		System.out.println(k.getSalary());
		
		
}
}

