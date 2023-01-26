package InterviewOwnPreparation;

public class dupWord {

	public static void main(String[] args) {
		
		String sentence =  "abc==abc++abc==bc++abc++ab+ab";
	//	int count = 0;
		//myString.split("==|++")
		// myString.split("(==)|(\\+\\+)")
		String[] word = sentence.split("(==)|\\+\\+");
		
		for(int i=0;i<word.length;i++)
		{
			int count = 0;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					//System.out.println(word[i]);
				}
				
				
			}
			
			if(count == 1)
			{
				System.out.println(word[i]);
			}
		}

	}

}
