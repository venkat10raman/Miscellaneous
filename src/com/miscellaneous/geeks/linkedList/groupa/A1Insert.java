package com.miscellaneous.geeks.linkedList.groupa;

public class A1Insert {
	
	private Node head;
	
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
	
	private void recursivePrint(Node node) {
		if(node == null) {
			System.out.println();
			return;
		}
		System.out.print(" --> " + node.getData());
		recursivePrint(node.getNext());
	}

	public static void main(String[] args) {
		A1Insert ll = new A1Insert();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		ll.recursivePrint(ll.head);
	}

}
