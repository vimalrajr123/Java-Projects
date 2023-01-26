package mypack;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Google2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int divBy = s.nextInt();
        int temp = 0;
        String str ="";

        int[] array = new int[len];
        for(int i=0;i<array.length;i++){
                array[i] = s.nextInt();
        }

        for (int i : array){
            str = str + String.valueOf(i);
        }

String[] strArray = new String[len * (len + 1) / 2];

for(int i=0;i<len;i++){
    for(int j=i;j<len;j++){
strArray[temp] = str.substring(i,j+1);
temp++;
    }
}

Set<Integer> sets = new HashSet<>();
int temp1 = 0;
for(String num : strArray)
{
    
    String[] hh = num.split("");
    int count = 0;
    for(String j : hh){
    int m = Integer.parseInt(j);
    count = count + m;
    }
    if (count  == 6){
        temp1=temp1+1;
           sets.add(Integer.valueOf(temp1));
    }
}

System.out.println(Collections.min(sets));

	}

}
