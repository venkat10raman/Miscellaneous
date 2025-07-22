package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A3InsertEnd {
	
	private Node head;
	private Node tail;
	
	private void insertEnd(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			tail = temp;
			temp.setNext(head);
		} else {
			temp.setNext(head);
			tail.setNext(temp);
			tail = temp;
		}
	}

	public static void main(String[] args) {
		A3InsertEnd ll = new A3InsertEnd();
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
				System.out.print(node.getData() + " --> ");
				node = node.getNext();
			} while(node != head);
			System.out.println();
		}
	}

}
