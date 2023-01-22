package funtionalInterfaceJava8;

//It can have any number of default, static methods but can contain only one abstract method. 
//It can also declare methods of object class.


@FunctionalInterface
interface Fun{
	void add();
	static void sub() {
		System.out.println("SUB");
	}
	default void mul() {
		System.out.println("MUL");
	}
	
}

public class FuntionalInterfaceMain implements Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuntionalInterfaceMain fm = new FuntionalInterfaceMain();
		fm.add();
		fm.mul();
		Fun.sub();
		

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("ADD");
		
	}

}
