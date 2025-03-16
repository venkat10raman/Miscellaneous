package com.miscellaneous.threads.casee;

public class DemoThreadJoinB {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable threadA = ()->{
			System.out.println(Thread.currentThread().getName() + " ::: has started the job");
			for(int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
			System.out.println(Thread.currentThread().getName() + " ::: has finished the job");
		};
		
		Thread t1 = new Thread(threadA);
		t1.setName("ThreadA");
		
		Runnable threadB = ()->{
			System.out.println(Thread.currentThread().getName() + " ::: has entered the job");
			try {
				System.out.println(Thread.currentThread().getName() + 
						" is on hold for the thread ::: " + t1.getName()
						+" ::: to finish the job");
				t1.join(5000, 500000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " ::: has started the job");
			for(int i = 1001; i <= 2000; i++) {
				System.out.println(i);
			}
			System.out.println(Thread.currentThread().getName() + " ::: has finished the job");
		};
		
		Thread t2 = new Thread(threadB);
		t2.setName("ThreadB");
		
		Runnable threadC = ()->{
			System.out.println(Thread.currentThread().getName() + " ::: has entered the job");
			try {
				System.out.println(Thread.currentThread().getName() + 
						" is on hold for the thread ::: " + t2.getName()
						+" ::: to finish the job");
				t2.join(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " ::: has started the job");
			for(int i = 2002; i <= 3000; i++) {
				System.out.println(i);
			}
			System.out.println(Thread.currentThread().getName() + " ::: has finished the job");
		};
		
		Thread t3 = new Thread(threadC);
		t3.setName("ThreadC");
		
		t3.start();
		t2.start();
		t1.start();
		
		System.out.println(Thread.currentThread().getName() + 
				" is on hold for the thread ::: " + t3.getName()
				+" ::: to finish the job");
		t3.join();
		System.out.println("Task is finished");
	}

}
