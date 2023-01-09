package MyPackageSample;

import AdditionalClasses.Car;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class is a custom data type
		
		Car c = new Car();
		c.setSpeed(100);
		System.out.println("Get Speed is "+c.getSpeed());
		
		c.setDoors("Closed");
		System.out.println(c.getDoors());
	}

}
