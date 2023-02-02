package designsingletonPattern;

public class SingletonPattern {
	
	//step 1: create a static class variable
	//step 2: make  constructor Private so in other classes new keyword to create obj will throw error
	//step 3: create a static method , so only this method can be used to create an object.
	
	
	// eager instantiation which creates the instatnce when the Jvm run, 
	//if this singleton object consumes more memory then its a wastage. prefer to use Lazy instantiation.
	//private static PracticalSingleton ps = new PracticalSingleton();
	private static SingletonPattern ps;
	
	//making the constructor Private. so "new" keyword cannot be used to create the Instance
	private SingletonPattern() {
		System.out.println("Instance Created");
		
	}
	
	//using synchronized is like a lock to a method .only one thread can executes this method at a time
	public static synchronized SingletonPattern getobj() {
		//Lazy instantiation
		if(ps==null)
		{
			ps= new SingletonPattern();
		}
		
		
		//double checked Locking
		// ==null is one check and syncronized block is another check
//		if(ps==null)
//		{
//			synchronized (ps) {
//				if(ps==null)
//				{
//					ps= new SingletonPattern();
//				}
//			}	
//		}
		
		
		
		
		
		return ps;
	}

}
