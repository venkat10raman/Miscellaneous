package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class B2PairwiseSwap {
	
	private Node head;
	
	private void pairwiseSwap() {
		if(head == null) {
			System.out.println("The list is Empty");
		} else if(head.next == null) {
			System.out.println("The list has only one element");
			print();
		} else {
			Node dummy = new Node(0);
			Node newHead = null, curr=head, prev=dummy, next=curr.next;
			while(curr != null && curr.next != null) {
				newHead = curr.next;
				prev.next = (newHead);
				prev = curr;
				next = newHead.next;
				newHead.next = (curr);
				curr.next = (next);
				curr = next;
			}
			head = dummy.next;
			dummy = null;
		}
	}

	public static void main(String[] args) {
		B2PairwiseSwap ll = new B2PairwiseSwap();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
		ll.insert(70);
		ll.insert(80);
		ll.insert(90);
		ll.print();
		ll.pairwiseSwap();
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
