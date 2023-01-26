package com.java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadP extends Thread{
//class ThreadP implements Runnable {
	String name;

	ThreadP(String name) {
		this.name = name;
	}

	public void run() {
		synchronized (this){
		System.out.println("Welcome" + Thread.currentThread().getName());
		}
	}
}

public class ThreadPool {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(3);

		for (int i = 1; i < 10; i++) {

			ThreadP pool = new ThreadP("Thread" + i);
			ex.execute(pool);
		}
		/*
		 * ThreadP t1 = new ThreadP("Thread1"); ThreadP t2 = new ThreadP("Thread2");
		 * ThreadP t3 = new ThreadP("Thread3"); ThreadP t4 = new ThreadP("Thread4");
		 * ThreadP t5 = new ThreadP("Thread5"); ThreadP t6 = new ThreadP("Thread6");
		 */

		/*
		 * Runnable t1 = new ThreadP("Thread1"); Runnable t2 = new ThreadP("Thread2");
		 * Runnable t3 = new ThreadP("Thread3"); Runnable t4 = new ThreadP("Thread4");
		 * Runnable t5 = new ThreadP("Thread5"); Runnable t6 = new ThreadP("Thread6");
		 * 
		 * 
		 * ex.execute(t1); ex.execute(t2); ex.execute(t3); ex.execute(t4);
		 * ex.execute(t5); ex.execute(t6);
		 */

		
		  ex.shutdown();
		  
			/*
			 * while(!ex.isTerminated()) { System.out.println("nnn"); }
			 */
		 

		if (ex.isTerminated()) {
			System.out.println("Terminated Successfully");
		}

		// TODO Auto-generated method stub

	}

}
