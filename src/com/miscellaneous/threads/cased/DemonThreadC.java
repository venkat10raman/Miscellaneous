package com.miscellaneous.threads.cased;

public class DemonThreadC {

	public static void main(String[] args) {

		Runnable userThread = ()-> {
			for(int i = 0; i < 1000; i++) {
				System.out.println("This is an user Thread...");
			}
		};
		
		Runnable daemonThread = ()-> {
			for(int i = 0; i < 1000; i++) {
				System.out.println("This is an daemon Thread...");
			}
		};
		
		Thread t1 = new Thread(userThread);
		t1.start();
		System.out.println(t1.isDaemon());
		
		Thread t2 = new Thread(daemonThread);
		t2.setDaemon(true);
		t2.start();
		System.out.println(t2.isDaemon());
		
		/*
		 * Demonstration of User thread and daemon thread : 
		 * In the below program, The task of daemon thread will not be completed.
		 * Program terminates as soon as user thread finishes it’s task.
		 * It will not wait for daemon thread to finish it’s task.
		 */
		
	}

}
