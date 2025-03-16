package com.miscellaneous.threads.casec;

public class CaseAStaticInnerClass {

	//Thread class as a nested class or Static Inner Class of the CaseAStaticInnerClass
	static class MyThreadA extends Thread {
		@Override
		public void run() {
			System.out.println("Keep some task here.....");
		}
	}

	//Another Thread class as a nested class or Static Inner Class of the CaseAStaticInnerClass
	static class MyThreadB implements Runnable {
		@Override
		public void run() {
			System.out.println("Keep some task here.....");
		}
	}

	public static void main(String[] args) {
		MyThreadA t1 = new MyThreadA();
		t1.start();
		
		Thread t2 = new Thread(new MyThreadB());
		t2.start();
	}

}
