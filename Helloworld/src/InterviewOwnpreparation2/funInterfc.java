package InterviewOwnpreparation2;

@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
   // void say2(String msg); 
}  
public class funInterfc implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    } 

	/*
	 * public void say2(String msg){ System.out.println(msg); }
	 */
    public static void main(String[] args) {  
    	funInterfc fie = new funInterfc();  
        fie.say("Hello there");  
    }  
}  
