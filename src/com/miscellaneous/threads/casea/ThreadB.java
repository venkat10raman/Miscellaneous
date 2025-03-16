package com.miscellaneous.threads.casea;

public class ThreadB extends Thread {

	@Override
	public void run() {
		for(int i = 1001; i <= 2000; i++){
			System.out.println(i);
		}
	}
	
}
