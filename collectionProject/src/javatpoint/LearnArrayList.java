package javatpoint;
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.clear();
		names.add("vimal");
		names.add("raj");
		names.add("Dhivya");
		names.add("Vimala");
		names.add("Raju");
		names.add("Raju");
		names.add(0, "a");
		names.add(null);
		names.add(null);


		LearnArrayList obj1 = new LearnArrayList();		
		obj1.displayList(names);

		}
	
		
		void displayList(List<String> name) {
			for(String i : name) {
				System.out.println(i);	
				
			}
		}
			
}
