package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A5RemoveDuplicates {
	
	private Node head;
	
	private void removeDuplicates() {
		if(head==null) {
			System.out.println("The list is empty");
		} else {
			Node prev = head;
			Node curr = head.next;
			
			while(curr != null) {
				if(curr.data == prev.data) {
					prev.next = (curr.next);
				} else {
					prev = prev.next;
				}
				curr = curr.next;
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
