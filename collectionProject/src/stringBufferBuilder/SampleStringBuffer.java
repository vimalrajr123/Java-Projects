package stringBufferBuilder;

public class SampleStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//synchronized and thread safe
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("vimal");
		StringBuffer sb3 = new StringBuffer(30);
		
		sb1.append("raj");
		sb2.insert(3, "fsdf");
		sb3.append("dhivya");
		
		System.out.println(sb1+" "+sb2+" "+sb3);

	}

}
