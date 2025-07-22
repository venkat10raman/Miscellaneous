package com.miscellaneous.geeks.linkedList.groupd.circular.doublee;

import com.miscellaneous.geeks.linkedList.groupb.doublee.DNode;

public class A1Insert {
	
	private DNode head;
	private DNode tail;
	
	private void insertHead(int data) {
		DNode node = new DNode(data);
		if(head == null) {
			head = node;
			node.setNext(head);
			node.setPrevious(head);
			tail = head;
		} else if(head.getNext() == head) {
			head.setNext(node);
			head.setPrevious(node);
			node.setNext(head);
			node.setPrevious(head);
			tail = head;
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
			node.setNext(head);
			head = node;
		}
	}
	
	private void insertTail(int data) {
		DNode node = new DNode(data);
		if(head == null) {
			head = node;
			node.setNext(head);
			node.setPrevious(head);
			tail = head;
		} else if(head.getNext() == head) {
			head.setNext(node);
			head.setPrevious(node);
			node.setNext(head);
			node.setPrevious(head);
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
			node.setNext(head);
			tail = node;
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is empty");
		} else if(head.getNext() == head) {
			head = null;
			tail = null;
		} else {
			DNode node = head.getNext();
			node.setPrevious(tail);
			tail.setNext(node);
			head.setNext(null);
			head.setPrevious(null);
			head = node;
		}
	}
	
	private void deleteTail() {
		if(tail == null) {
			System.out.println("The list is empty");
		} else if(tail.getNext() == tail) {
			tail = null;
			head = null;
		} else {
			DNode node = tail.getPrevious();
			node.setNext(head);
			head.setPrevious(node);
			tail.setNext(null);
			tail.setPrevious(null);
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
				System.out.print(" --> " + temp.getData());
				temp = temp.getNext();
			} while(temp != head);
			System.out.println();
		}
	}
}
