package singletonPattern;

class SingletonExample {
	   //step 1: create a static class variable
	   //step 2: make  constructor Private so in other classes new keyword to create obj will throw error
	   //step 3: create a static method , so only this method can be used to create an object.
	
	   // private field that refers to the object
	   private static SingletonExample singleObject;
	                                              
	   private SingletonExample() {
	      // constructor of the SingletonExample class
	   }

	   public static SingletonExample getInstance() {
		   return null;
	      // write code that allows us to create only one object
	      // access the object as per our need
	   }
	   
	   public static void main(String args[]) {
		   
			WithoutSingleton s1 =  WithoutSingleton.getObj();
			WithoutSingleton s2 =  WithoutSingleton.getObj();
			
			
			System.out.println(s1.hashCode()+" "+s2.hashCode());
			System.out.println(s1==s2);
		   
	   }
	}
