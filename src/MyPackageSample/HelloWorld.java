package MyPackageSample;
public class HelloWorld {

	public static void main(String[] args) 
	{
		//Casting
		int a= 10;
		short b= (short)a;
		b=20;
		boolean c = false;
		int x=0;
		x+=10;
		System.out.println(b+" "+c+" "+x);
		
		
		//ternary operator
		int d=(a==b)? a:b;
		System.out.println(d);
		
		//variable comparison
		int e= 10;
		float f= 10.1f;
		if(e==f) 
			{
				System.out.println(e+" "+f);
			}
		else 
			{
				System.out.println("not matched");
			}
		
		//Switch case
		int cs=2;
		switch(cs) 
		{
			case 1:{
				System.out.println("print 1");
				break;
			}
			case 2:{
				System.out.println("print 2");
				break;
			}
			case 3:{
				System.out.println("print 3");
				break;
			}
			default:{
				System.out.println("default");
				break;
			}
		}
		
		
		//Loop
		int i=1;
		System.out.println("for");
		for(i=1;i<10;i++) {
			System.out.println(i);
			}

		System.out.println("while");
		i=1;
		while(i<10) {
			System.out.println(i);
			i++;
			}

		System.out.println("dowhile");
		i=1;
		do {
			System.out.println(i);
			i++;
			}while(i<10);
		
		
		
		//string to integer comparison
		String str="1000000";
		Integer z=Integer.parseInt(str); //returns 
		Integer h = Integer.valueOf(i);//returns Integer object
		
		System.out.println(z+h);

	}

}
