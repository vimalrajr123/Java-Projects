package com.java.Thread;


class Printer{
	
	synchronized void printerMethod(int n) {
		
		for(int i=1;i<5;i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Thread1 extends Thread{
	Printer p;
	Thread1(Printer p){
		this.p = p;
	}
	
	public void run() {
		p.printerMethod(10);
	}
	
}

class Thread2 extends Thread{
	Printer p;
	Thread2(Printer p){
		this.p = p;
	}
	
	public void run() {
		p.printerMethod(5);
	}
	
}



public class SynMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer p = new Printer();
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		
		t1.start();
		t2.start();

	}

}
