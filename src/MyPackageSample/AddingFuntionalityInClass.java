package MyPackageSample;

import AdditionalClasses.Car;

public class AddingFuntionalityInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();

		c.setDoors("closed");
		c.setEngine("on");
		c.setSpeed(100);
		if (c.isCarRunning()) {
			System.out.println("car is running");
		} else {
			System.out.println("car is stopped");
		}

	}

}
