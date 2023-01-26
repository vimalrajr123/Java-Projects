package mypack;

public class TryingSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {2,3,7};
		
		int len = array.length;
		
		String s = "";
		int temp = 0;
		
		for(int h : array) {
			s = s+ String.valueOf(h);
		}
		
		
		String[] strarr = new String[len * (len+1) /2];
		
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=i;j<s.length();j++) {
			strarr[temp] = s.substring(i,j+1);
			temp++;
			}
			
		}
		
		for(String num: strarr) {
			System.out.println(num);
		}
		
		
		/*
		 * for(int i=0;i<len) {
		 * 
		 * }
		 */

	}

}
