package javatpoint;

import java.util.*;

import java.util.concurrent.CopyOnWriteArrayList;

public class LearnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to make the List Syncronized
		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		
		Iterator<Integer> itr=numbers.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		numbers.add(500);
		}  
		
		System.out.println("*******");
		for(Integer i : numbers) {
			System.out.println(i);	
			
		}
		
		LearnLinkedList Lst = new LearnLinkedList();
		
		//Collections.synchronizedList(null)y

	}

}
