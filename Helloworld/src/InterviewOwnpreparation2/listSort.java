package InterviewOwnpreparation2;

import java.util.ArrayList;
import java.util.Collections;

public class listSort {

	public static void main(String[] args) {

		ArrayList<define> mainList = new ArrayList<define>();
//		define dd=new define(1, "Ajay", "System Engineer", 5000);
//		mainList.add(dd);
		mainList.add(new define(1, "Ajay", "System Engineer", 5000));
		mainList.add(new define(2, "Bala", "Java Developer", 6000));
		mainList.add(new define(3, "Ram", "Business Analyst", 4000));
		mainList.add(new define(4, "Dhivya", "Python Developer", 6000));
		mainList.add(new define(5, "Ram", "System Engineer", 5000));
		mainList.add(new define(6, "Bala", "UI Developer", 5000));
		System.out.println(mainList.get(0).getName());
		
		for(define dd:mainList ) {
			System.out.println(dd.getName());
		}
		
		
		//Collections.sort(mainList, co);
		
		
	}
}
 
