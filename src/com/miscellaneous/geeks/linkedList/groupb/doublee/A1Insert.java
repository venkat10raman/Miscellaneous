package com.miscellaneous.geeks.linkedList.groupb.doublee;

public class A1Insert {
	
	private DNode head;
	private DNode tail;
	
	private void insert(int data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
		} else if(tail != null) {
			tail.next = (newNode);
			newNode.previous = (tail);
			tail = newNode;
		} else {
			DNode curr = head;
			
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = (newNode);
			newNode.previous = (curr);
			tail = newNode;
		}
	}
	
	private void insertHead(int data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
		} else {
			newNode.next = (head);
			head.previous = (newNode);
			head = newNode;
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			DNode temp = head;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	private void printReverse() {
		if(tail == null) {
			System.out.println("Linked list is empty");
		} else {
			DNode temp = tail;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.previous;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		A1Insert dll = new A1Insert();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.insert(4);
		dll.insert(5);
		dll.print();
		dll.printReverse();
		dll.insertHead(0);
		dll.print();
	}

}
