package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A5RemoveDuplicates {
	
	private Node head;
	
	private void removeDuplicates() {
		if(head==null) {
			System.out.println("The list is empty");
		} else {
			Node prev = head;
			Node curr = head.getNext();
			
			while(curr != null) {
				if(curr.getData() == prev.getData()) {
					prev.setNext(curr.getNext());
				} else {
					prev = prev.getNext();
				}
				curr = curr.getNext();
			}
		}
	}

	public static void main(String[] args) {
		A5RemoveDuplicates ll = new A5RemoveDuplicates();
		ll.insert(10);
		ll.insert(10);
		ll.insert(20);
		ll.insert(20);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		ll.removeDuplicates();
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
