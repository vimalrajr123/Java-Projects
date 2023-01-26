package com.java.Thread;


class Threadgp  extends Thread{
	
	Threadgp(String name, ThreadGroup tg){
		super(tg,name);
		start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadGroupClass {

	public void finalize() {
		System.out.println("Garbage collected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup tg = new ThreadGroup("ThreadGroup");
		Threadgp t1 = new Threadgp ("First", tg);
		Threadgp t2 = new Threadgp ("Second", tg);
		new Threadgp("Three",tg);
		
		
		ThreadGroupClass tt = new ThreadGroupClass();
		tt = null;
		System.gc();

	}

}
