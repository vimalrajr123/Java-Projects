package singletonPattern;

public class WithoutSingleton {
	
	private static WithoutSingleton ws;
	
	private WithoutSingleton(){
		
	}
	
	public static WithoutSingleton getObj() {
		
		
		if(ws==null) {
			ws= new WithoutSingleton();
		}
		return ws;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WithoutSingleton s1 =  WithoutSingleton.getObj();
		WithoutSingleton s2 =  WithoutSingleton.getObj();
		
		
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		PracticalSingleton p1 = PracticalSingleton.getobj();
		PracticalSingleton p2 = PracticalSingleton.getobj();
		System.out.println(p1+" "+p2);
		
	}

}
