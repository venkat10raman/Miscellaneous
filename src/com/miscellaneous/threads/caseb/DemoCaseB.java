package com.miscellaneous.threads.caseb;

public class DemoCaseB {

	public static void main(String[] args) {
		//Creating first thread
		Thread t1 = new Thread(new ThreadA());
		t1.start();

		//Creating second thread
		Thread t2 = new Thread(new ThreadB());
		t2.start();

	}

}
