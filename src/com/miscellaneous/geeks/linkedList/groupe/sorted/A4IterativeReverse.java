package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A4IterativeReverse {
	
	private Node head;
	
	private void reverse() {
		if(head == null) {
			System.out.println("The list is empty...");
		} else {
			Node prev = null;
			Node curr = head;
			Node next = curr.getNext();
			while(curr != null) {
				next = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = next;
			}
			head = prev;
		}
	}
	
	public static void main(String[] args) {
		A4IterativeReverse ll = new A4IterativeReverse();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		ll.reverse();
		ll.print();
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
