package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A1Insert {
	
	private Node head;
	
	private void print() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		System.out.print(head.getData() + " --> ");
		for(Node n=head.getNext(); n != head; n=n.getNext()) {
			System.out.print(n.getData() + " --> ");
		}
		
		System.out.println();
		Node node = head;
		do {
			System.out.print(node.getData() + " --> ");
			node = node.getNext();
		} while (node != head);
		System.out.println();
	}
	
	private void insertHead(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			temp.setNext(head);
		} else {
			Node node = head;
			while(node.getNext() != head) {
				node = node.getNext();
			}
			node.setNext(temp);
			temp.setNext(head);
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is Empty!");
		} else if(head.getNext() == head) {
			head = null;
		} else {
			Node curr = head;
			while(curr.getNext() != head) {
				curr = curr.getNext();
			}
			curr.setNext(head.getNext());
			head = curr.getNext();
		}
	}

	public static void main(String[] args) {
		A1Insert ll = new A1Insert();
		ll.insertHead(10);
		ll.print();
		ll.deleteHead();
		ll.print();
		ll.insertHead(60);
		ll.insertHead(20);
		ll.insertHead(30);
		ll.insertHead(40);
		ll.insertHead(50);
		ll.print();
		ll.deleteHead();
		ll.print();
	}

}
