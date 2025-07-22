package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A8DeleteNode {
	
	private Node head;
	
	private void deleteNode(Node node) {
		if(node.getNext() ==  null) {
			node.setData(0);
		} else {
			node.setData(node.getNext().getData());
			node.setNext(node.getNext().getNext());
		}
	}

	public static void main(String[] args) {
		A8DeleteNode ll = new A8DeleteNode();
		ll.insertNode(10);
		ll.insertNode(20);
		Node node = ll.insertNode(30);
		ll.insertNode(40);
		ll.insertNode(50);
		Node six = ll.insertNode(60);
		ll.print();
		ll.deleteNode(node);
		ll.print();
		ll.deleteNode(six);
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
