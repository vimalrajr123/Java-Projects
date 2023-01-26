package com.java.Thread;

public class DeadLockThread {

	// TODO Auto-generated constructor stubn()
	public static void main(String args[]) {

		final String str1 = "Printer";
		final String str2 = "Writer";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (str1) {
					System.out.println("welcome t1 one");

					try {
						Thread.sleep(1000);
						System.out.println("waiting t1");
					} catch (Exception e) {

					}
					synchronized (str2) {
						System.out.println("welcome t1 two");

						try {
							Thread.sleep(1000);
						} catch (Exception e) {

						}
					}

				}
			}

		};
		
		
		
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (str2) {
					System.out.println("welcome t2 one");

					try {
						Thread.sleep(1000);
						System.out.println("waiting t1");
					} catch (Exception e) {

					}
					synchronized (str1) {
						System.out.println("waiting t1");
						System.out.println("welcome t2 two");

						try {
							Thread.sleep(1000);
						} catch (Exception e) {

						}
					}

				}
			}

		};
		
		t1.start();
		t2.start();

	}

}
