package lambdaFilterSortedMapCollect;

import java.util.*;

public class PracticalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PracticalStudent> studentList = new ArrayList<>();
		PracticalStudent student1 = new PracticalStudent(100, "vimal", 10000);
		PracticalStudent student2 = new PracticalStudent(300, "raj", 40000);
		PracticalStudent student3 = new PracticalStudent(400, "dhivya", 500);
		PracticalStudent student4 = new PracticalStudent(200, "ram", 400);
		PracticalStudent student5 = new PracticalStudent(100, "vimal", 10000);
		PracticalStudent student6 = new PracticalStudent(300, "raj", 40000);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		
		for(PracticalStudent n : studentList) {
			System.out.println(n);
		}
		
		Set<PracticalStudent> studentsSets = new HashSet<>();
		studentsSets.addAll(studentList);
		
		System.out.println("__________________________");
		
		for(PracticalStudent n : studentsSets) {
			System.out.println(n);
		}
		
		
		
		System.out.println("_________LinkedHashset_________________");
		Set<PracticalStudent> studentHashSet = new LinkedHashSet<>();
		studentHashSet.addAll(studentList);
		for(PracticalStudent n : studentHashSet) {
			System.out.println(n);
		}
		
		
		System.out.println("_________sorted_________________");
		List<PracticalStudent> studentList1 = new ArrayList<>();
		studentList1.addAll(studentHashSet);
		Comparator<PracticalStudent> idComparator = Comparator.comparing(PracticalStudent::getId);
		Collections.sort(studentList1,idComparator);
		
		//Collections.sort(studentList1,Comparator.comparing(PracticalStudent::getId));
		for(PracticalStudent n : studentList1) {
			System.out.println(n);
		}
		
		
		
		
		
//		System.out.println("__________TreeSet________________");
//		Set<PracticalStudent> studentTreeSet = new TreeSet<>();
//		//studentTreeSet.addAll(studentList);
//		PracticalStudent student10 = new PracticalStudent(100, "vimal", 10000);
//		PracticalStudent student20 = new PracticalStudent(300, "raj", 40000);
//		PracticalStudent student30 = new PracticalStudent(400, "dhivya", 500);
//		PracticalStudent student40 = new PracticalStudent(200, "ram", 400);
//		PracticalStudent student50 = new PracticalStudent(100, "vimal", 10000);
//		PracticalStudent student60 = new PracticalStudent(300, "raj", 40000);
//		studentTreeSet.add(student10);
//		studentTreeSet.add(student20);
//		studentTreeSet.add(student30);
//		studentTreeSet.add(student40);
//		studentTreeSet.add(student50);
//		studentTreeSet.add(student60);
//		for(PracticalStudent n : studentTreeSet) {
//			System.out.println(n);
//		}
		
		
		
		

	}

}
