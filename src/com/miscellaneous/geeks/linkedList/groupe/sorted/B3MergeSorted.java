package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class B3MergeSorted {
	
	private void mergeSorted(Node one, Node two) {
		if(one == null && two != null) {
			System.out.println("Given first list is empty...!");
			print(two);
		} else if(one != null && two == null) {
			System.out.println("Given second list is empty...!");
			print(one);
		} else if(one == null && two == null) {
			System.out.println("Given both lists are empty...!");
		} else {
			Node head = null, tail = null;
			
			if(one.getData() <= two.getData()) {
				head = tail = one;
				one = one.getNext();
			} else {
				head = tail = two;
				two = two.getNext();
			}
			
			while(one != null && two != null) {
				if(one.getData() < two.getData()) {
					tail.setNext(one);
					one = one.getNext();
				} else {
					tail.setNext(two);
					two = two.getNext();
				}
				tail = tail.getNext();
			}
			
			while(one != null) {
				tail.setNext(one);
				one = one.getNext();
				tail = tail.getNext();
			}
			
			while(two != null) {
				tail.setNext(two);
				two = two.getNext();
				tail = tail.getNext();
			}
			print(head);
		}
	}

	public static void main(String[] args) {
		B3MergeSorted one = new B3MergeSorted();
		Node oneHead = new Node(10);
		one.insertNode(oneHead, 20);
		one.insertNode(oneHead, 70);
		one.insertNode(oneHead, 80);
		one.insertNode(oneHead, 90);
		one.insertNode(oneHead, 100);
		one.insertNode(oneHead, 120);
		
		B3MergeSorted two = new B3MergeSorted();
		Node twoHead = new Node(30);
		two.insertNode(twoHead, 40);
		two.insertNode(twoHead, 50);
		two.insertNode(twoHead, 60);
		two.insertNode(twoHead, 70);
		
		one.print(oneHead);
		two.print(twoHead);
		one.mergeSorted(oneHead, twoHead);
	}
	
	private Node insertNode(Node head, int data) {
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
	
	private void print(Node head) {
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
