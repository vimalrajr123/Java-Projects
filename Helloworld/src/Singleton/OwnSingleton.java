package Singleton;


class Single{
	private Single() {
		
	}
	
	private static Single single = null;
	
	public static Single getInstance() {
		
		if(single == null) {
			synchronized (Single.class) {
				
				
			
			single = new Single();
			}
		}
		
		return single;
	}
}

public class OwnSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		

	}

}
