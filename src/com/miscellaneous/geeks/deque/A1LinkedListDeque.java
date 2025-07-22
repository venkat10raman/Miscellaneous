package com.miscellaneous.geeks.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class A1LinkedListDeque {

	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<Integer>();
		
		dq.addFirst(10);
		dq.addLast(20);
		dq.addFirst(5);
		dq.addLast(15);
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
		dq.addFirst(5);
		dq.addLast(15);
		
		Iterator<Integer> it = dq.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		it = dq.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

}
