package com.miscellaneous.geeks.linkedList.groupa;

public class A4Search {
	
	private Node head;
	
	private void search(int data) {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			Node node = head;
			int index = 0;
			boolean notFound = true;
			while(node != null) {
				if(node.getData() == data) {
					notFound = false;
					System.out.println(data + " is found at index " + index);
				}
				index++;
				node = node.getNext();
			}
			if(notFound) {
				System.out.println(data + " is not present in the linked-list");
			}
		}
	}
	
	private void recursiveSearch(Node node, int data, int index) {
		if(node == null) {
			System.out.println(data + " is not present in the linked-list");
		} else if(node.getData() == data ) {
			System.out.println(data + " is found at index " + index);
			recursiveSearch(node.getNext(), data, index+1);
		} else {
			recursiveSearch(node.getNext(), data, index+1);
		}
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

	public static void main(String[] args) {
		A4Search ll = new A4Search();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(1);
		ll.search(1);
		ll.recursiveSearch(ll.head, 1, 0);
	}

}
