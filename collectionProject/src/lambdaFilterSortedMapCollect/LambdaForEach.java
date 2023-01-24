package lambdaFilterSortedMapCollect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LambdaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new  ArrayList<>();
		l.add("vimal");
		l.add("Dhivya");
		l.add("atharva");
		
		Set<String> k = new  HashSet<>();
		k.add("vimal1");
		k.add("Dhivya1");
		k.add("atharva1");
		
		l.addAll(k);
		
		l.forEach(
				(h)->System.out.println(h)
				);

	}

}
