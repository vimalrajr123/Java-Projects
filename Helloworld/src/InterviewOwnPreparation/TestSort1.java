package InterviewOwnPreparation;

import java.util.*;

public class TestSort1 {

	
	static{
System.out.println("hh");	
	}
	
	{
		System.out.println("iiii");
	}
	
	
	public static void main(String args[]) {

		
		TestSort1 s1= new TestSort1();
		TestSort1 s11= new TestSort1();
		TestSort1 s12= new TestSort1();
		TestSort1 s13= new TestSort1();
		
		ArrayList al1 = new ArrayList();
		al1.add(1);
		al1.add("fghghghgh");
		al1.add(1.0);
		
		
		Map m =new HashMap();
		m.put(1, 2);
		m.put(12, 2.9);
		m.put("111","sss");
		
		
		System.out.println(m);
		
		
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));
		

		Collections.sort(al);
		for (Student1 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		

		ArrayList<Student> al11 = new ArrayList<Student>();
		al11.add(new Student(101, "Vijay"));
		al11.add(new Student(106, "Ajay"));
		al11.add(new Student(105, "Jai"));
		

		//Collections.sort(al11);// needs comparable to overide
		for (Student st : al11) {
			System.out.println(st.getId() + " " + st.getName() );
		}
		
	}
}  
