package Task1;

public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "vimal";
		System.out.println(s1.hashCode());
		String s2 = "vimal";
		System.out.println(s2.hashCode());
		s2 =s1.concat(s2);
		System.out.println(s2.hashCode());

		
		
		System.out.println("------------");
		
		String s3 = new String("vimal");
		System.out.println(s3.hashCode());
		String s4 = new String("fhgh");
		System.out.println(s4.hashCode());
		s4 =s3.concat("dhivya");
		System.out.println(s4.hashCode());



	}

}
