package MyPackageSample;

public class Globalvariable {
	public int i =100;

	public static void main(String[] args) {
		// to access the global variable need to create object even including access specifier
		System.out.println(new Globalvariable().i);

	}

}
