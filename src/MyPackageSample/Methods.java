package MyPackageSample;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(10,20.0f);
	}
	//this is static method because we dint use the object
	public static void add(int i,int j) {
		System.out.println("add 1"+(i+j));
	}
	
	//method overloading
	public static void add(int i, float j) {
		System.out.println("add 2"+(i+j)); 
	}
	
	

}
