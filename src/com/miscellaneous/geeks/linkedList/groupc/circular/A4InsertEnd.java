package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A4InsertEnd {
	
	private Node head;
	
	private void insertEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = (head);
		} else {
			newNode.next = (head.next);
			head.next = (newNode);
			
			int temp = head.data;
			head.data = (newNode.data);
			newNode.data = (temp);
		}
	}

	public static void main(String[] args) {
		A4InsertEnd ll = new A4InsertEnd();
		ll.insertEnd(10);
		ll.print();
		ll.insertEnd(20);
		ll.insertEnd(30);
		ll.print();
	}
	
	private void print() {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			Node node = head;
			do {
				System.out.print(node.data + " --> ");
				node = node.next;
			} while(node != head);
			System.out.println();
		}
	}

}
