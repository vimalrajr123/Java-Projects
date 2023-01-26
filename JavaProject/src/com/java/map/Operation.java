package com.java.map;
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
class Operation{  
	 static int data=50;  
	  
	 static void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  