package mypack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OwnDiffTeam {

	public static void main(String[] args) {
		
	//	int[] array = {3,4,3,1,6,5};
		int[] array = {1,3,4,5,8,9};
		int n = array.length;
		int teamSize = 3;
		int maxDiff = 2;	
		List<Integer> list = new ArrayList<Integer>();
		for(int k=0;k<n;k++) {
			list.add(array[k]);
		}
		Collections.sort(list);
		int count =0;
		
		// 133 456 - 2set 
		//(0 1 2   j=2 i=0
		//3 4 5) j=5 i=3
		
		int j= teamSize - 1; // 2
		int i=0;
		while(j < n) {
			
			if(list.get(j) -list.get(i) <= maxDiff) {
				System.out.println("j  - i : "+ list.get(j) + " "+ list.get(i));
				count++;
				i= j+1;
				System.out.println("i : "+i);
				j = i+2;
				System.out.println("j : "+j);
			}
			else {
				i++;
				j++;
			}
		}
		
System.out.println(count);

	}

}
