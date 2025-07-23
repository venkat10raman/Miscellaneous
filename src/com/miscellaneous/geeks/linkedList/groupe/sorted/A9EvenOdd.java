package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A9EvenOdd {
	
	private Node head;
	
	private void segregate() {
		Node es = null, ee = null;
		Node os = null, oe = null;
		Node curr = head;
		while(curr != null) {
			if(curr.data%2 == 0) {
				if(es == null) {
					es = curr;
					ee = curr;
				} else {
					ee.next = (curr);
					ee = curr;
				}
			} else if(os == null) {
				os = curr;
				oe = curr;
			} else {
				oe.next = (curr);
				oe = curr;
			}
			curr = curr.next;
		}
		
		if(head.data%2 == 0) {
			head = es;
			ee.next = (os);
			oe.next = (null);
		} else {
			head = os;
			oe.next = (es);
			ee.next = (null);
		}
	}

	public static void main(String[] args) {
		A9EvenOdd ll = new A9EvenOdd();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.print();
		ll.segregate();
		ll.print();
		System.out.println("-------------------");
		ll.head = null;
		ll = new A9EvenOdd();
		ll.insert(0);
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.print();
		ll.segregate();
		ll.print();
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
