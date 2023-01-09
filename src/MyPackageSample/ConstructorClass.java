package MyPackageSample;

import AdditionalClasses.CarWithConstructor;

public class ConstructorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke default constructor
		CarWithConstructor d = new CarWithConstructor();
		// invoke Parameterised constructor
		CarWithConstructor c = new CarWithConstructor("closed", "on", "seated", 10);
		// default constructor
		if (d.isCarRunning()) {
			System.out.println("car is running");
		} else {
			System.out.println("car is stopped");
		}
		// Parameterised constructor
		if (c.isCarRunning()) {
			System.out.println("car is running");
		} else {
			System.out.println("car is stopped");
		}
		
		
		/**
		 * to set the values use the constructors don't use setters.
		 * 
		 */
		
		
		
	}

}
