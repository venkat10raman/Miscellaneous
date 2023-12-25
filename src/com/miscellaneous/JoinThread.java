package com.miscellaneous;

/*

Geeks for Geeks

join(): It will put the current thread on wait until 
the thread on which it is called is dead. 
If thread is interrupted then it will throw InterruptedException.

join(long millis) :It will put the current thread on wait 
until the thread on which it is called is dead or 
wait for specified time (milliseconds).

join(long millis, int nanos): It will put the current thread on wait 
until the thread on which it is called is dead or wait for 
specified time (milliseconds + nanos).
 */


public class JoinThread {

	public static void main(String[] args) {
		final Runnable runnable = () -> {
			for (int i = 1; i <= 5; i++) {
				try {
					Thread.sleep(100);
					System.out.println("Runnable Thread Name "
							+ Thread.currentThread().getName()
							+ " ::: " + i);
				} catch (InterruptedException e) {
					System.out.println("Exception has been caught on sleep");
				}
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		// thread t1 starts 
		t1.start();

		try {
			System.out.println("Current Thread :: "
					+ Thread.currentThread().getName());

			// starts t2 after t1 has died
			t1.join();
		}catch(Exception e) {
			System.out.println("Exception has been caught on Join t1");
		}

		// t2 starts 
		t2.start();
		
		try {
			System.out.println("Current Thread :: "
					+ Thread.currentThread().getName());

			// starts t3 after t2 has died 
			t2.join();
		}catch(Exception e) {
			System.out.println("Exception has been caught on Join t2");
		}
		
		t3.start();

	}

}
