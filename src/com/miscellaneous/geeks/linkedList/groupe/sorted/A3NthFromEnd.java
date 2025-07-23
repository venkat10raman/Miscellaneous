package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A3NthFromEnd {
	
	private Node head;
	
	private void nthFromEnd(int position) {
		if(head == null) {
			System.out.println("The list is empty");
		} else if(position == 1 && head.next == null) {
			System.out.println(position + "th node from the End is :: " + head.data);
		} else {
			Node fast = head;
			Node slow = head;
			int count = 1;
			while (count < position && fast != null) {
				count++;
				fast = fast.next;
			}
			
			if(fast != null && count <= position) {
				while(fast != null && fast.next != null) {
					fast = fast.next;
					slow = slow.next;
				}
				System.out.println(position + "th node from the End is :: " + slow.data);
			} else {
				System.out.println("Given position is outofbound...");
			}
		}
	}

	public static void main(String[] args) {
		A3NthFromEnd ll = new A3NthFromEnd();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		
		ll.nthFromEnd(5);
		ll.nthFromEnd(1);
		ll.nthFromEnd(3);
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
