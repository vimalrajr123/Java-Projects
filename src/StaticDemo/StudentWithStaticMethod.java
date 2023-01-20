package StaticDemo;

public class StudentWithStaticMethod {
	
	public void normal() {
		Student.college = "aaa";
	}

	public static void main(String[] args) {
		
		
		
		Student s1 = new Student(20, "vimal");
		Student s2 = new Student(21, "Dhivya");
		s1.display();
		Student.change();
		s2.display();
		
		StudentWithStaticMethod d = new StudentWithStaticMethod();
		d.normal();
		Student s3 = new Student(23, "sdfsf");
		s3.display();
		
	}

}

class Student{
	int id;
	String name;
	static String college="NUS";
	
	public Student(int id, String name) {
		this.id = id;
		this.name =  name;
	}
	public static void change() { //The static method can not use non static data member or call non-static method directly
		college = "BSA";
		//id= 200; (compile time error)
	}
	public void display() {
		System.out.println(id+"-"+name+"-"+college);
	}
}