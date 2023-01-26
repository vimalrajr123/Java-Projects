package mypack;

import java.util.Scanner;

public class google1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int leng = s.nextInt();

        int[] array = new int[leng];
        for(int i=0;i<array.length;i++)
        {
                array[i] = s.nextInt();
        }
		// TODO Auto-generated method stub
        for(int i=0;i<array.length;i++)
        {
               System.out.println(array[i]);
        }
        

	}

}
