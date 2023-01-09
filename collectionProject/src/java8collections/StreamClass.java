package java8collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student emp1 = new Student(1, "vimal", 28, 10000);
		Student emp2 = new Student(5, "dhivya", 28, 30000);
		Student emp3 = new Student(3, "aaa", 30, 20000);
		Student emp4 = new Student(2, "vimal", 21, 30000);
		Student emp5 = new Student(4, "ccc", 19, 40000);
		Student emp6 = new Student(6, "ccc", 14, 7000);
		Student emp7 = new Student(7, "ccc", 12, 400);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(emp5);
		studentList.add(emp4);
		studentList.add(emp1);
		studentList.add(emp3);
		studentList.add(emp2);
		studentList.add(emp6);
		studentList.add(emp7);
		
		List<Integer> sample = studentList.stream().filter(p->p.getAge()>20)
													.map(p->p.getAge())
													.collect(Collectors.toList());
		
		sample.forEach(e->System.out.println(e));
		
		List<String> name = studentList.stream().filter(p->p.getAge()>20)
													.map(p->p.getName())
													.collect(Collectors.toList());
		
		name.forEach(e->System.out.println(e));
		
		
	}

}
