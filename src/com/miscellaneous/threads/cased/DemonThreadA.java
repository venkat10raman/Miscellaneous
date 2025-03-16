package com.miscellaneous.threads.cased;

public class DemonThreadA {

	public static void main(String[] args) {
		
		Runnable userThread = ()->{
			for(int i = 0; i < 1000; i++) {
				System.out.println("This is an user Thread...");
			}
		};
		
		Thread t1 = new Thread(userThread);
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isDaemon());
		
		/*
		1.User Thread :
		User threads are threads which are created by the application or user. 
		They are high priority threads. 
		JVM (Java Virtual Machine) will not exit until all user threads finish their execution. 
		JVM wait for these threads to finish their task.
		These threads are foreground threads.

		2.Daemon Thread :
		Daemon threads are threads which are mostly created by the JVM.
		These threads always run in background.
		These threads are used to perform some background tasks like garbage collection and house-keeping tasks.
		These threads are less priority threads.
		JVM will not wait for these threads to finish their execution.
		JVM will exit as soon as all user threads finish their execution.
		JVM doesn’t wait for daemon threads to finish their task.
		*/
	}

}
