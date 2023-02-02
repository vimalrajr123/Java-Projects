
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String URL = "http:www.google.com/@replaceURI=dfsdf";
		int a = URL.indexOf("@replaceURI");
		String b = URL.substring(0, a);
		System.out.println(b);

	}

}
