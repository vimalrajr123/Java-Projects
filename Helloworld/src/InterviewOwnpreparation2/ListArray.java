package InterviewOwnpreparation2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
	public static void main(String[] args) {
		String a[] = {"2","34"};
		
		List<String> list= Arrays.asList(a);
		System.out.println("List" +list);
		
		
		String[] s1 = list.toArray(new String[0]);
		System.out.println("Array" + s1.length);

		List<Student> slist = new ArrayList<>();
		List<Student> slist1 = new ArrayList<>();

		Student st1 = new Student();
		st1.setId(1);
		st1.setName("aa");

		Student st12 = new Student();
		st12.setId(2);
		st12.setName("aa");

		Student st13 = new Student();
		st13.setId(3);
		st13.setName("aa");
		
		slist.add(st13);
		slist.add(st12);
		slist.add(st1);
		
		slist.stream().filter(st -> (st.getId()==3)).forEach(
				st -> slist1.add(st));
		
		
		for(Student dd : slist1){
		System.out.println(dd.getId() +" " +dd.getName());
		
		}
		
		
       Integer a1[] = {1,2,4};
		
		List<Integer> list1= Arrays.asList(a1);
		
		
		Integer[] in = list1.toArray(new Integer[0]);
		
		for(Integer i : in)
		{
			System.out.println("Integer[] : "+ i);
			
		}
		
		
		
		/*forEach(String s: s1)
		{
			System.out.println("Array" + s.length());
		}*/
		
	}
}
