package mypack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team1 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int team = 3;// teamSize
		//int[] skill = {3,4,3,1,6,5};
		int[] skill = {5,1,2,1,4,5,7,7,9};
		int n = skill.length; 
		int i=0, j=team-1, cnt=0;
		int diff = 2;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int k=0;k<n;k++) {
			list.add(skill[k]);
		}
		
		Collections.sort(list);
		
		for(int g : list) {
			System.out.print(g + " ");
		}
		System.out.println();
		
		//System.out.println("Before while j < n : " + j + " < " + n);
		while(j<n) {
			System.out.println("while loop starts");
			System.out.println("j < n : " + j + " < " + n);
			System.out.println();
			if(list.get(j) - list.get(i) <= diff){
				System.out.println("If Starts");
				System.out.println("a[j] - a[i] < = diff : " + list.get(j)  +" "+ list.get(i));
				cnt++;
				i=j+1;
				System.out.println("i = j+1 :" + i);
				j=j+team;
				System.out.println("j=j+team :" + j);
				System.out.println();
			}else {
				i++;
				j++;
				
				System.out.println("Else Starts");
				System.out.println("i++ j++ :" + i + " " + j);
				System.out.println();
			}
		}
		
		System.out.println("Count :" + cnt);

	}

}
