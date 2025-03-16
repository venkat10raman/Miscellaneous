package com.miscellaneous.threads.caseb;

public class DemoCaseB1 {

	public static void main(String[] args) {
		Runnable threadA = () -> {
			for(int i = 0; i <= 500; i++){
				System.out.println(i);
			}
		};
		
		Runnable threadB = () -> {
			for(int i = 501; i <= 1000; i++){
				System.out.println(i);
			}
		};
		
		Thread t1 = new Thread(threadA);
		Thread t2 = new Thread(threadB);
		
		t1.start();
		t2.start();
	}

}
