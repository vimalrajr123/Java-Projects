package InterviewOwnpreparation2;

public class nameTCS{

	public static void main(String[] args) {

		String str="Srishtijainsiruseri"; 
		char strarr[]=str.toCharArray();
		String emp="";
		int j=2;

		for(int i=0;i<str.length();i++)
		{
			emp=emp+strarr[i];

			if(i== j)
			{
				emp=emp+" TCS ";
				j+=3;
			}

		}
		System.out.print(emp);

	}

}
