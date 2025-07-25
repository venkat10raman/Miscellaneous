package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A1SortedInsert {

	private Node head;

	private void sortedInsert(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		} else if(data < head.data) {
			temp.next = (head);
			head = temp;
		} else {
			Node curr = head;
			while(curr.next != null && curr.next.data < data) {
				curr = curr.next;
			}
			temp.next = (curr.next);
			curr.next = (temp);
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

	public static void main(String[] args) {
		A1SortedInsert ll = new A1SortedInsert();
		ll.sortedInsert(50);
		ll.sortedInsert(20);
		ll.sortedInsert(30);
		ll.sortedInsert(40);
		ll.sortedInsert(10);
		ll.sortedInsert(60);
		ll.print();
	}

}
