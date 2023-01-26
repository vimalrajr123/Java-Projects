package singletonPattern;

public class PracticalSingleton {
	
	private static PracticalSingleton ps;
	
	private PracticalSingleton() {
		
	}
	
	
	public static PracticalSingleton getobj() {
		
		if(ps==null)
		{
			ps= new PracticalSingleton();
		}
		
		return ps;
	}

}
