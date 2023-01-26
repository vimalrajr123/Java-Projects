package InterviewOwnpreparation2;

import java.io.*;  
class Parent{  
  void msg ()throws ArithmeticException
  {System.out.println("parent");}  
}  
  
class excptn extends Parent{  
  void msg(){  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
   Parent p=new excptn();  
   p.msg();  
  }  
}  