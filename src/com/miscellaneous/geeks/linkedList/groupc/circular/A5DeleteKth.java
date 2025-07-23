package com.miscellaneous.geeks.linkedList.groupc.circular;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A5DeleteKth {
	
	private Node head;
	
	private void deleteKth(int k) {
		if(head == null) {
			System.out.println("The list is empty!");
		} else if(head.next == head) {
			head = null;
		} else {
			Node curr = head;
			for (int i = 0; i < k-2; i++) {
				curr = curr.next;
			}
			curr.next = (curr.next.next);
		}
	}

	public static void main(String[] args) {
		A5DeleteKth ll = new A5DeleteKth();
		ll.insertHead(10);
		ll.print();
		ll.insertHead(30);
		ll.insertHead(40);
		ll.deleteKth(2);
		ll.print();
		ll.insertHead(60);
		ll.insertHead(50);
		ll.print();
	}
	
	private void insertHead(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			temp.next = (head);
		} else {
			Node node = head;
			while(node.next != head) {
				node = node.next;
			}
			node.next = (temp);
			temp.next = (head);
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		Node node = head;
		do {
			System.out.print(node.data + " --> ");
			node = node.next;
		} while (node != head);
		System.out.println();
	}

}
