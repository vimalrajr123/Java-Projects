package Singleton;

class Vimal {

	private Vimal() {

	}

	private static Vimal v = new Vimal();
	//private static Vimal v = null;
	public static Vimal getInstance() {

		/*
		 * if(v == null) { return new Vimal(); }
		 */
		
		return v;
	}

}

public class Dhivya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Vimal v = new Vimal(); Vimal v2 = new Vimal();
		 */
		Vimal vim = Vimal.getInstance();
		Vimal vim1 = Vimal.getInstance();

		System.out.println(vim);
		System.out.println(vim1);

	}

}
