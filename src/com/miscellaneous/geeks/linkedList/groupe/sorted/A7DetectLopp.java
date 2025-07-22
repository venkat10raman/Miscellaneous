package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A7DetectLopp {
	
	private Node head;
	
	private void detectRemoveLoop() {
		Node slow=head, fast=head;
		
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			if(slow == fast) {
				break;
			}
		}
		
		if(slow != fast) {
			System.out.println("No loop found in the linked list");
		} else {
			if(slow == head) {
				while(slow.getNext() != fast) {
					slow = slow.getNext();
				}
				slow.setNext(null);
			} else {
				slow = head;
				while(slow.getNext() != fast.getNext()) {
					slow = slow.getNext();
					fast = fast.getNext();
				}
				fast.setNext(null);
			}
			
		}
	}

	public static void main(String[] args) {
		A7DetectLopp ll = new A7DetectLopp();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		ll.detectRemoveLoop();
		ll.print();
		
		System.out.println();
		
		ll = new A7DetectLopp();
		ll.insertNode(10);
		ll.insertNode(20);
		Node node = ll.insertNode(30);
		ll.insertNode(40);
		ll.insertNode(50);
		ll.insertNode(60).setNext(node);
		ll.detectRemoveLoop();
		ll.print();
	}
	
	private Node insertNode(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		} else {
			Node curr = head;
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
		}
		return temp;
	}
	
	private void insert(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			temp.setNext(head);
		} else {
			Node curr = head;
			while(curr.getNext() != head){
				curr = curr.getNext();
			}
			curr.setNext(temp);
			temp.setNext(head);
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = head;
			do {
				System.out.print(" --> " + temp.getData());
				temp = temp.getNext();
			} while(temp != head && temp != null);
			System.out.println();
		}
	}

}
