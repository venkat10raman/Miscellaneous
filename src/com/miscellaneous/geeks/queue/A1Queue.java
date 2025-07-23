package com.miscellaneous.geeks.queue;

import java.util.Stack;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A1Queue {
	
	private Node head;
	private Node tail;

	public static void main(String[] args) {
		A1Queue queue = new A1Queue();
		
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
		
		queue.deque();
		queue.deque();
		queue.deque();
		
	}
	
	private void enque(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = (temp);
			tail = temp;
		}
	}
	
	private void deque() {
		if(head == null) {
			System.out.println("The queue is empty");
		} else {
			System.out.println(head.data + " :: dequed from the Queue");
			head = head.next;
			if(head == null) {
				tail = null;
			}
		}
	}
	
}
