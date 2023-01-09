package arrayproject;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr1 = {1,2,3,4,5};
		String[] StringArr1 = {"vimal", "raj"};
		
		
		int n=5;
		int[] intArr2 = new int[n];
		System.out.println(intArr2);
		
		
		intArr2[0]=1;
		System.out.println(intArr2 +"\n"+ intArr2[0]);
		
		System.out.println(intArr2.length);
		
		for(int i=0;i<intArr2.length;i++) {
			System.out.println(intArr2[i]);
		}
		
		//foreach
		for(int arr : intArr1) {
			System.out.println(arr);
		}

	}

}
