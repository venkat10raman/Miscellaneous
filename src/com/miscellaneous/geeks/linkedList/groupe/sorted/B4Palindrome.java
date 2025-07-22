package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class B4Palindrome {

	private Node head;
	
	private void checkPalindrome() {
		if(head == null) {
			System.out.println("The list is Empty...!");
		} else {
			Node fast=head, slow=head;
			
			while(fast.getNext() != null && fast.getNext().getNext() != null) {
				fast = fast.getNext().getNext();
				slow = slow.getNext();
			}
			Node rev = reverseList(slow.getNext());
			slow.setNext(rev);
			Node curr = head;
			while(rev != null) {
				if(rev.getData() != curr.getData()) {
					System.out.println("Given list is not palindrome");
					return;
				}
				rev = rev.getNext();
				curr = curr.getNext();
			}
			System.out.println("Given list is a Palindrome");
			print();
			
		}
	}
	
	private Node reverseList(Node node) {
		Node curr = node;
		Node prev = null, next = curr.getNext();
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		B4Palindrome ll = new B4Palindrome();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		ll.print();
		ll.checkPalindrome();
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
