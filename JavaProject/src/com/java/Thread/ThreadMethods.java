package com.java.Thread;


class ThreadM extends Thread{
	
	public void run() {
		System.out.println("Welcome" + Thread.currentThread());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Alive");
		}
	}
}

public class ThreadMethods {
	
	public static void main(String[] args) {
		
		
		ThreadM t1 = new ThreadM();
		t1.setPriority(10);
		t1.setName("Dhivya");
		t1.start();
		//t1.setName("hhh"); // workinh
		//t1.setDaemon(false); // not working
		
		
		ThreadM t2 = new ThreadM();
		t2.setDaemon(true);
		t2.start();
	}

}
