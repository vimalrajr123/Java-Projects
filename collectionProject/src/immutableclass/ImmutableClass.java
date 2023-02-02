package immutableclass;

public final class ImmutableClass {
	
	private final String name;
	
//	The above class is immutable because:
//
//		The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
//		The class is final so we cannot create the subclass.(we cannot inherit the final class)
//		There is no setter methods i.e. we have no option to change the value of the instance variable.
	
	public ImmutableClass(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImmutableClass obj = new ImmutableClass("vimalraj");
		System.out.println(obj.getName());

	}

}
