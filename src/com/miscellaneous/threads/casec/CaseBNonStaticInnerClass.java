package com.miscellaneous.threads.casec;

public class CaseBNonStaticInnerClass {

	//Thread class as a nested class or Static Inner Class of the CaseBNonStaticInnerClass
	class MyThreadA extends Thread {
		@Override
		public void run() {
			System.out.println("Keep some task here.....");
		}
	}

	//Another Thread class as a nested class or Static Inner Class of the CaseBNonStaticInnerClass
	class MyThreadB implements Runnable {
		@Override
		public void run() {
			System.out.println("Keep some task here.....");
		}
	}

	public static void main(String[] args) {
		MyThreadA t1 = new CaseBNonStaticInnerClass().new MyThreadA();
		t1.start();
		
		MyThreadB threadB = new CaseBNonStaticInnerClass().new MyThreadB();
		Thread t2 = new Thread(threadB);
		t2.start();
	}

}
