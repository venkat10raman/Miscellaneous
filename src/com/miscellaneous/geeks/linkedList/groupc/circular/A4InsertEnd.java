package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A4InsertEnd {
	
	private Node head;
	
	private void insertEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.setNext(head);
		} else {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			
			int temp = head.getData();
			head.setData(newNode.getData());
			newNode.setData(temp);
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
				System.out.print(node.getData() + " --> ");
				node = node.getNext();
			} while(node != head);
			System.out.println();
		}
	}

}
