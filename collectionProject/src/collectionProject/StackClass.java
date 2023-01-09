package collectionProject;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> box = new Stack<>();
		box.push(0);
		box.push(1);
		box.push(2);
		box.push(3);
		box.pop();
		
		System.out.println(box.peek());
		
		for(Integer a:box) {
			System.out.println(a);
		}
		
		System.out.println(box.isEmpty());
		System.out.println(box.search(2));

	}

}
