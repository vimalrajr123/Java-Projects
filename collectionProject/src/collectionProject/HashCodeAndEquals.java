package collectionProject;
import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names = new HashSet<>();
		names.add("Happy");
		names.add("Sad");
		names.add("Fun");
		names.add("Cool");
		names.add("Sad");
		
		System.out.println(names);
		
		Set<Student> students = new HashSet<>();
		Student s1= new Student(100,"vimal",20,30000);
		Student s2= new Student(101,"vimal1",20,30000);
		Student s3= new Student(102,"vimal2",20,30000);
		Student s4= new Student(103,"vimal3",20,30000);
		Student s5= new Student(100,"vimal",20,30000);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println(students);
		

	}

}
