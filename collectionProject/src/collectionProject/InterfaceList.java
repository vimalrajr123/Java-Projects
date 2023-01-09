package collectionProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> countries = new LinkedList<>();
		countries.add("india");
		countries.add("singapore");
		countries.add("UAE");
		countries.add("germany");
		//anonymous Object
		new InterfaceList().printList(countries);
		
		//preferable way of coding
		List<String> number = new ArrayList<>();
		number.add("1");
		number.add("2");
		number.add("3");
		number.add("4");
		new InterfaceList().printList(number);
		
		ArrayList<Integer> num = new ArrayList<>(); 
		num.add(1);
		num.add(2);
		num.add(3);
		new InterfaceList().print(num);
		
		

	}
	
	void printList(List<String> list) {
		for(String element:list) {
			System.out.println(element);
		}
		System.out.println("*********");
			
	}
	
	void print(List<Integer> list) {
		for(Integer element:list) {
			System.out.println(element);
		}
		System.out.println("*********");
			
	}

}
