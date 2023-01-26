package InterviewOwnPreparation;

public class RemoveWhitespaceinstring {

	public static void main(String[] args) {
		
		
		String str = "      gg        j      ";
		
		String dd = str.concat("hol");
		
		System.out.println("dd");
		
		String kk = str.trim();
		System.out.println("trim : " + kk + "Wel"); // remove misleading space
		
		String[] gg = str.split(" ");
		
		System.out.println(gg.length);
		String gg1= "";
		
		for(String bb : gg)
		{
			
			gg1 = gg1+bb;
			
		}
		
		System.out.println(gg1);
		
		// TODO Auto-generated method stub

	}

}
