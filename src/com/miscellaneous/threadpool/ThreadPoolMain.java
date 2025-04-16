package com.miscellaneous.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolMain {

	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES,
				new ArrayBlockingQueue<>(2),
//				Executors.defaultThreadFactory()
				new CustomThreadFactory(),
//				new ThreadPoolExecutor.DiscardPolicy()
				new CustomRejectHandler()
				);
		
		for(int i=0; i < 8; i++) {
			executor.submit(()->{
				try {
					Thread.sleep(5000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Task processed by :: "+ Thread.currentThread().getName());
			});
		}
		
	}

}
