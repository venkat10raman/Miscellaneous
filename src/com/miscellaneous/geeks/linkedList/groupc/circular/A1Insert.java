package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A1Insert {
	
	private Node head;
	
	private void print() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		System.out.print(head.data + " --> ");
		for(Node n=head.next; n != head; n=n.next) {
			System.out.print(n.data + " --> ");
		}
		
		System.out.println();
		Node node = head;
		do {
			System.out.print(node.data + " --> ");
			node = node.next;
		} while (node != head);
		System.out.println();
	}
	
	private void insertHead(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			temp.next = (head);
		} else {
			Node node = head;
			while(node.next != head) {
				node = node.next;
			}
			node.next = (temp);
			temp.next = (head);
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is Empty!");
		} else if(head.next == head) {
			head = null;
		} else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = (head.next);
			head = curr.next;
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
