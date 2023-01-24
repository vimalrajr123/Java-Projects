package StaticDemo;

public class WithoutStatic {
	
	static int count=0; //static variable will get the memory only once it will retain its value.
	
	public WithoutStatic() {
		// TODO Auto-generated constructor stub
		count++;
		//count=count+1;
		System.out.println(count);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WithoutStatic s1 = new WithoutStatic();
		WithoutStatic s2 = new WithoutStatic();
		WithoutStatic s3 = new WithoutStatic();
		

	}

}


