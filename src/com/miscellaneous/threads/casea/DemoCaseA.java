package com.miscellaneous.threads.casea;

public class DemoCaseA {

	public static void main(String[] args) {
		//Creating first thread
		ThreadA t1 = new ThreadA();
		t1.start();

		//Creating second thread
		ThreadB t2 = new ThreadB();
		t2.start();
	}

}
