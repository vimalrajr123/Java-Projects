package javatpoint;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArraySet<Integer> numbers = new CopyOnWriteArraySet<Integer>();
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
		
		LearnSet Lst = new LearnSet();
		
		//Collections.synchronizedList(null)y

	}
	
}