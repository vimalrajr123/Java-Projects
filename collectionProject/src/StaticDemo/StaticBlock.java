package StaticDemo;

public class StaticBlock {
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instatnce block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock s1 = new StaticBlock();
		StaticBlock s2 = new StaticBlock();
		
		

	}

}
