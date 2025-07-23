package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A2InsertHead {
	
	private Node head;
	private Node tail;
	
	private void insertHead(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			tail = head;
			temp.next = (head);
		} else {
			tail.next = (temp);
			temp.next = (head);
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is Empty!");
		} else if(head.next == head) {
			head = null;
		} else {
			tail.next = (head.next);
			head = tail.next;
		}
	}

	public static void main(String[] args) {
		A2InsertHead ll = new A2InsertHead();
		ll.insertHead(10);
		ll.print();
		ll.deleteHead();
		ll.print();
		ll.insertHead(60);
		ll.insertHead(50);
		ll.print();
	}
	
	private void print() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		Node node = head;
		do {
			System.out.print(node.data + " --> ");
			node = node.next;
		} while (node != head);
		System.out.println();
	}

}
