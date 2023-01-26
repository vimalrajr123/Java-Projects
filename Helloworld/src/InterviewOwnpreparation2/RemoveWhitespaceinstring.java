package InterviewOwnpreparation2;

public class RemoveWhitespaceinstring {

	public static void main(String[] args) {
		
		
		String str = "ggg jjjj jj";
		
		String[] gg = str.split(" ");
		String gg1= "";
		
		for(String bb : gg)
		{
			
			gg1 = gg1+bb;
			
		}
		
		System.out.println(gg1);
		
		// TODO Auto-generated method stub

	}

}
