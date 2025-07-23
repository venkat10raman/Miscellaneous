package com.miscellaneous.geeks.linkedList.groupa;

public class A2InsertPosition {
	
	private Node head;
	
	private void insertHead(int data) {
		Node newHead = new Node(data);
		if(head == null) {
			head = newHead;
		} else {
			newHead.next = head;
			head = newHead;
		}
	}
	
	private void insertTail(int data) {
		Node tail = new Node(data);
		if(head == null) {
			head = tail;
		} else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = tail;
		}
	}
	
	private void insertAtIndex(int data, int index) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		} else {
			Node curr = head;
			if(index == 0) {
				node.next = head;
				head = node;
				return;
			}
			int position = 1;
			while(curr.next != null && position < index) {
				curr = curr.next;
				position++;
			}
			if(index > position) {
				System.out.println("Given index is outOfBound");
			} else if(curr.next == null && index == position) {
				curr.next = node;
			} else {
				node.next = curr.next;
				curr.next = node;
			}
			
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
		A2InsertPosition ll = new A2InsertPosition();
		ll.insertHead(20);
		ll.insertTail(30);
		ll.insertAtIndex(10, 0);
		ll.insertAtIndex(50, 3);
		ll.insertAtIndex(40, 3);
		ll.print();
	}

}
