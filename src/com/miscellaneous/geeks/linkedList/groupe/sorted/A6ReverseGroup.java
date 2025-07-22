package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class A6ReverseGroup {
	
	private Node head;
	
	private Node recursiveReverseGroup(Node node, int groupSize) {
		Node curr=node, next=null, prev=null;
		int count = 0;
		
		while(curr != null && count<groupSize) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
			count++;
		}
		
		if(curr != null) {
			Node groupHead = recursiveReverseGroup(curr, groupSize);
			node.setNext(groupHead);
		}
		return prev;
	}
	
	private void reverseGroup(int groupSize) {
		Node curr = head, prevFirst = null;
		boolean isFirstPass = true;
		int count = 0;
		while(curr != null) {
			Node first = curr, prev = null;
			while(curr != null && count < groupSize) {
				Node next = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = next;
				count++;
			}
			if(isFirstPass) {
				isFirstPass = false;
				head = prev;
			} else {
				prevFirst.setNext(prev);
			}
			prevFirst = first;
			count = 0;
		}
	}

	public static void main(String[] args) {
		A6ReverseGroup ll = new A6ReverseGroup();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		ll.reverseGroup(3);
		ll.print();
		ll.head = ll.recursiveReverseGroup(ll.head, 2);
		ll.print();
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
