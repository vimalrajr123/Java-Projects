package collectionProject;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<>();
		Set<String> LHS = new LinkedHashSet<>();
		Set<String> TS = new TreeSet<>();
		
		s.add("vimal");
		s.add("Dhivya");
		s.add("Vimala");
		s.add("Raju");
		s.add(null);
		
		
		LHS.add("vimal");
		LHS.add("Dhivya");
		LHS.add(null);
		LHS.add("Vimala");
		LHS.add("Raju");
		LHS.add(null);
		
		
		TS.add("vimal");
		TS.add("Dhivya");
		TS.add("Vimala");
		TS.add("Raju");
		TS.add("dhivya");

		new SetClass().printlist(s);
		System.out.println("***********");
		new SetClass().printlist(LHS);
		System.out.println("***********");
		new SetClass().printlist(TS);

	}
	
	
	void printlist(Set<String> s) {
		for(String name:s) {
			System.out.println(name);
		}
	}

}
