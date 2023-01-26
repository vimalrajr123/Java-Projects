package mypack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackCode {
	
	public static void main(String[] args) {
		List<Integer> weights = new ArrayList<>();
		weights.add(5);
		weights.add(6);
		weights.add(2);
		weights.add(9);
		weights.add(1);
		//1 3 1 - 6
		// 1 3 1 5 - 18
		// 5 6 2 9 1 - 62
	//	System.out.println("Start Time : " + System.currentTimeMillis());
		int res = imbalance(weights);
	//	System.out.println("End Time : " + System.currentTimeMillis());
		System.out.println(res);
		
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
