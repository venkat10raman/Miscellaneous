package com.miscellaneous.geeks.queue;

import java.util.LinkedList;
import java.util.Queue;

public class A4GenerateNumbers {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("5");
		queue.add("6");
		
		for (int i = 0; i < 20; i++) {
			String curr = queue.poll();
			System.out.println(curr);
			queue.add(curr + "5");
			queue.add(curr + "6");
		}
	}

}
