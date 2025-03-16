package com.miscellaneous.threads.caseb;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		for(int i = 1001; i <= 2000; i++){
			System.out.println(i);
		}
	}

}
