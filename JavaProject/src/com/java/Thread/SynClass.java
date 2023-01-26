package com.java.Thread;


class Printer1{
	
	synchronized static void printerMethod(int n) {
		
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

class Thread11 extends Thread{
	Printer1 p;
	Thread11(Printer1 p){
		this.p = p;
	}
	
	public void run() {
		p.printerMethod(10);
	}
	
}

class Thread21 extends Thread{
	Printer1 p;
	Thread21(Printer1 p){
		this.p = p;
	}
	
	public void run() {
		p.printerMethod(5);
	}
	
}



public class SynClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer1 p = new Printer1();
		Thread11 t1 = new Thread11(p);
		Thread21 t2 = new Thread21(p);
		
		t1.start();
		t2.start();

	}

}
