package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String customerQuery = "mouse";
		List<String> repository = new ArrayList<>();
		repository.add("mobile");
		repository.add("mouse");
		repository.add("moneypot");
		repository.add("monitor");
		repository.add("mousepad");
		
		List<List<String>> mainList = new ArrayList<List<String>>();
		
		String[] oldArray = customerQuery.split("");
		
		String[] newArray = new String[oldArray.length-1];
		
		newArray[0] = oldArray[0] + oldArray[1];
		for(int i=1;i<newArray.length;i++) {
			newArray[i] = newArray[i-1].concat(oldArray[i+1]);
		}
		
		
		
		for(String newValues: newArray) {
			List<String> sortList = new ArrayList<>();
			List<String> finalList = new ArrayList<>();
			
			
			for(String repoValue: repository) {				
				if(repoValue.startsWith(newValues)) {
					sortList.add(repoValue);
				}
			}
			
			Collections.sort(sortList);
			
			
			  if(sortList.size() <= 3) {
			  
			  for(int i=0;i<sortList.size();i++) { finalList.add(sortList.get(i)); }
			  
			  }else{ for(int i=0;i<3;i++) { finalList.add(sortList.get(i)); } }
			 
			
			mainList.add(finalList);
	
		}//end for
		
		
		for(List<String> list: mainList) {

			/*
			 * for(String result: list) { System.out.print(result); System.out.print(" "); }
			 */
			System.out.println(list);
			
		}
		
	}

}
