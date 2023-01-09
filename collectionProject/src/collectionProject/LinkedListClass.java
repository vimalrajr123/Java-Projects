package collectionProject;

import java.util.LinkedList;

public class LinkedListClass {
	
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("india");
		countries.add("singapore");
		countries.add("UAE");
		countries.add("germany");
		//anonymous Object
		new LinkedListClass().printList(countries);
		countries.add(1,"USA");
		new LinkedListClass().printList(countries);
		countries.set(1, "States");
		new LinkedListClass().printList(countries);
		countries.remove();  //removes first element
		countries.remove(2);
		new LinkedListClass().printList(countries);
	}
	
	void printList(LinkedList<String> list) {
		for(String element:list) {
			System.out.println(element);
		}
		System.out.println("*********");
			
	}

}
