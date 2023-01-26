package com.java.project;

public class Sam2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		 int n= arr.length;
         // Base case
       if (n == 1) {
           System.out.print(0);
           return;
       }
       // Initialize memory to all arrays
       int left[] = new int[n];
       int right[] = new int[n];
       int prod[] = new int[n];

       int i, j;

       /* Left most element of left array
is always 1 */
       left[0] = 1;

       /* Rightmost most element of right
array is always 1 */
       right[n - 1] = 1;

       /* Construct the left array */
       for (i = 1; i < n; i++)
           left[i] = arr[i - 1] * left[i - 1];
       
       for (i = 0; i < n; i++)
       System.out.println("left : " + left[i]);

       /* Construct the right array */
       for (j = n - 2; j >= 0; j--)
           right[j] = arr[j + 1] * right[j + 1];
       
       for (i = 0; i < n; i++)
       System.out.println("right : " + right[i]);

       /* Construct the product array using
       left[] and right[] */
       for (i = 0; i < n; i++)
           prod[i] = left[i] * right[i];

       /* print the constructed prod array */
       for (i = 0; i < n; i++)
           System.out.print(prod[i] + " ");

     //  return prod;
		// TODO Auto-generated method stub

	}

}
