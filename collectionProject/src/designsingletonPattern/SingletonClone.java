package designsingletonPattern;

public class SingletonClone implements Cloneable {
	
	private static SingletonClone ps ;
	
	private SingletonClone() {
		System.out.println("Instance Created");
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		throw new CloneNotSupportedException();
	}

	public static SingletonClone getobj() {
		//Lazy instantiation
		if(ps==null)
		{
			ps= new SingletonClone();
		}
		return ps;
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//shallow cloning
		SingletonClone s1 = SingletonClone.getobj();
		SingletonClone s2 = (SingletonClone) s1.clone();
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		

	}

}
