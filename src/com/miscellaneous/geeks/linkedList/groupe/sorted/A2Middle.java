package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A2Middle {

	private Node head;
	
	private void middle() {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			Node slow=head, fast=head;
			while(fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("The middle node is :: " + slow.data);
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
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = (new Node(data));
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = head;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
	}

}
