package com.miscellaneous.geeks.linkedList.groupd.circular.doublee;

import com.miscellaneous.geeks.linkedList.groupb.doublee.DNode;

public class A1Insert {
	
	private DNode head;
	private DNode tail;
	
	private void insertHead(int data) {
		DNode node = new DNode(data);
		if(head == null) {
			head = node;
			node.next = (head);
			node.previous = (head);
			tail = head;
		} else if(head.next == head) {
			head.next = (node);
			head.previous = (node);
			node.next = (head);
			node.previous = (head);
			tail = head;
			head = node;
		} else {
			tail.next = (node);
			node.previous = (tail);
			node.next = (head);
			head = node;
		}
	}
	
	private void insertTail(int data) {
		DNode node = new DNode(data);
		if(head == null) {
			head = node;
			node.next = (head);
			node.previous = (head);
			tail = head;
		} else if(head.next == head) {
			head.next = (node);
			head.previous = (node);
			node.next = (head);
			node.previous = (head);
			tail = node;
		} else {
			tail.next = (node);
			node.previous = (tail);
			node.next = (head);
			tail = node;
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is empty");
		} else if(head.next == head) {
			head = null;
			tail = null;
		} else {
			DNode node = head.next;
			node.previous = (tail);
			tail.next = (node);
			head.next = (null);
			head.previous = (null);
			head = node;
		}
	}
	
	private void deleteTail() {
		if(tail == null) {
			System.out.println("The list is empty");
		} else if(tail.next == tail) {
			tail = null;
			head = null;
		} else {
			DNode node = tail.previous;
			node.next = (head);
			head.previous = (node);
			tail.next = (null);
			tail.previous = (null);
			tail = node;
		}
	}

	public static void main(String[] args) {
		A1Insert dll = new A1Insert();
		dll.insertHead(10);
		dll.print();
		dll.insertHead(20);
		dll.insertHead(30);
		dll.print();
		dll.deleteHead();
		dll.print();
		dll.deleteHead();
		dll.print();
		dll.deleteHead();
		dll.print();
		System.out.println("---------------");
		dll = new A1Insert();
		dll.insertTail(10);
		dll.print();
		dll.insertTail(20);
		dll.insertTail(30);
		dll.print();
		dll.deleteTail();
		dll.print();
		dll.deleteTail();
		dll.print();
		dll.deleteTail();
		dll.print();
	}
	

	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			DNode temp = head;
			do {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			} while(temp != head);
			System.out.println();
		}
	}
}
