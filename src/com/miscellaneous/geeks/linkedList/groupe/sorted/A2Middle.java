package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A2Middle {

	private Node head;
	
	private void middle() {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			Node slow=head, fast=head;
			while(fast != null && fast.getNext() != null) {
				fast = fast.getNext().getNext();
				slow = slow.getNext();
			}
			System.out.println("The middle node is :: " + slow.getData());
		}
	}

	public static void main(String[] args) {
		A2Middle ll = new A2Middle();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		ll.middle();
		ll.insert(60);
		ll.print();
		ll.middle();
	}
	
	private void insert(int data) {
		if(head == null) {
			head = new Node(data);
		} else {
			Node curr = head;
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(new Node(data));
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = head;
			while(temp != null) {
				System.out.print(" --> " + temp.getData());
				temp = temp.getNext();
			}
			System.out.println();
		}
	}

}
