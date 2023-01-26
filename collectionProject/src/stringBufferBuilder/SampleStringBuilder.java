package stringBufferBuilder;

public class SampleStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non synchronized and thread safe
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("vimal");
		StringBuilder sb3 = new StringBuilder(30);
		
		sb1.append("raj");
		sb2.insert(3, "fsdf");
		sb3.append("dhivya");
		
		System.out.println(sb1+" "+sb2+" "+sb3);

	}

}
