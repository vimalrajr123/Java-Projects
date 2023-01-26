package mypack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class StackCodeOwn {
	
	public static void main(String[] args) {
		List<Integer> weights = new ArrayList<>();
		weights.add(1);
		weights.add(2);
		weights.add(3);
		
		int len = weights.size();		
		String str = "";			
			for(int i=0;i<weights.size();i++) {
				str = str + String.valueOf(weights.get(i));				
			}
		
		String[] array = new String[len * (len+1) /2];
		int temp = 0;
		Set<Integer> set = new TreeSet<>();
		for(int i=0; i<len;i++) {
			for(int j=i; j<len; j++) {				
				array[temp] = str.substring(i, j+1);
				set.add(Integer.valueOf(array[temp]));
				temp++;
			}
		}
		
		for(int k : set) {
			System.out.println(k);
		}
		
	}

	private static int imbalance(List<Integer> weights) {
		// TODO Auto-generated method stub
		 return sumSubArray(weights,false) - sumSubArray(weights,true);
	}

	private static int sumSubArray(List<Integer> weights, boolean min) {
		// TODO Auto-generated method stub
		//int ;
		Stack<Integer> valueStack = new Stack<Integer>();
		Stack<Integer> countStack = new Stack<Integer>();
		int curSum = 0, sum = 0;
		
		for(int curValue : weights) {
			int curCount = 1;
			while(!valueStack.empty()) {
				
				if(min && valueStack.peek() < curValue) {
					break;
				}else if(!min && valueStack.peek() > curValue) {
					break;
				}
				
				int value = valueStack.pop();
				int count = countStack.pop();
				curCount = curCount + count;
				curSum = curSum - (value * count);
				
			}//while end
			
			valueStack.push(curValue);
			countStack.push(curCount);
			curSum = curSum + curValue * curCount;
			sum = sum + curSum;		
			
		}//for end
		
		return sum;
	}

	

}
