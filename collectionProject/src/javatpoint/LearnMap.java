package javatpoint;


import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConcurrentHashMap<Integer,String> student = new ConcurrentHashMap<Integer,String>();
		
		student.put(100, "vimal");
		student.put(200, "Raj");
		student.put(300, "vimala Raju");
		
		for(Entry<Integer,String> entry : student.entrySet()) {
			
			System.out.println(entry.getKey()+"   "+ entry.getValue());
			student.put(400, "Dhivya");
			System.out.println(entry.getKey()+"   "+ entry.getValue());
			
		}
		
		LearnMap map= new LearnMap();

	}
	
	

}
