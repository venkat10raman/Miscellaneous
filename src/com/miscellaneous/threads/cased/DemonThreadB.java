package com.miscellaneous.threads.cased;

public class DemonThreadB {

	public static void main(String[] args) {
		Runnable userThread = ()->{
			for(int i = 0; i < 1000; i++) {
				System.out.println("This is an user Thread...");
			}
		};
		
		Thread t1 = new Thread(userThread);
		System.out.println(t1.isDaemon());
		t1.start();
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		
		/*
		 * You can’t set a daemon property after starting the thread. 
		 * If you try to set the daemon property when the thread is active,
		 * It will throw a IllegalThreadStateException at run time.
		 */
	}

}
