package collectionProject;

import java.util.ArrayList;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int is a primitive Datatype
		//Integer is a wrapper class, The Integer class wraps a value of the primitive type int in an object
		//ArrayList is a collection of object 
		ArrayList<Integer> studentNumber = new ArrayList<>();
		studentNumber.add(25); //autoboxing 
		studentNumber.add(Integer.valueOf(2));
		System.out.println(studentNumber.get(0)); //unboxing
		System.out.println(studentNumber.get(1));

		
		//using wrapper class
		ArrayList<IntWrapper> studentNo = new ArrayList<>();
		studentNo.add(new IntWrapper(12)); //boxing
		System.out.println(studentNo.get(0).getIntValue()); //unboxing
	}

}

/*Wrapper class is used for boxing and unboxing 
 * 
 */

class IntWrapper{
	public int intValue;

	public IntWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}
