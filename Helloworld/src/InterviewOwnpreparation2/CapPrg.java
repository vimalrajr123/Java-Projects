package InterviewOwnpreparation2;

public class CapPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "CAPGEMINI";
		String s1="";
		int n =2;
		
		for(int i=0 ; i<s.length();i++) {
			
			s1=s1+ s.charAt(i);
		
			
			/*
			 * if(i==2 || i==5 || i==8) { s1= s1+ "abc"; }
			 */
			
			if(i==n) {
				s1= s1+ "abc";
				n= n+ 3;
				}
		}
			System.out.println("OUTPUT : " + s1);	

	}

}
