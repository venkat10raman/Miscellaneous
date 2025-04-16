package com.miscellaneous.DSA.implement;

public class A1LinkedList {
	// Head of the list
	private Node head;

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Method to insert a new node at the end
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Method to delete a node by key
	private void delete(int key) {
		Node temp = head, prev = null;

		// If the list is empty
		if (temp == null) return;

		// If head node itself holds the key
		if(temp.data == key) {
			head = temp.next;
			return;
		}

		// Search for the key to be deleted
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not found
		if (temp == null) return;

		// Unlink the node
		prev.next = temp.next;
	}

	private boolean hasCycle() {
		if(head == null || head.next == null) {
			return false;
		}

		Node slow = head, fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	private void middleNode() {
		if(head == null) {
			System.out.println("list is empty");
		} else if(head.next == null) {
			System.out.println("Middle node is :: "+ head.data);
		} else {
			Node slow = head, fast = head.next;
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("Middle node is :: "+ slow.data);
		}
	}

	private Node removeNthFromEnd(int n) {
		// create a dummy node
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node first = dummy;
		Node second = dummy;
		// Move first pointer n+1 steps ahead
		for (int i = 0; i <= n; i++) {
			first = first.next;
		}

		// Move both pointers until first reaches the end
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		
		// Remove the n-th node
		second.next = second.next.next;
		
		head = dummy.next;
		
		//discard dummy
		dummy =null;
		return head;
	}
	
	private void reverse() {
		Node previous = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	private void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		A1LinkedList list = new A1LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);

		System.out.println("Linked List after insertion:");
		list.printList();

		list.delete(20);
		System.out.println("Linked List after deletion of 20:");
		list.printList();

		System.out.println(list.hasCycle()? "List has cycle" : "List has no cycle");
		System.out.println(list.removeNthFromEnd(2).data);
		list.printList();
		System.out.println(list.removeNthFromEnd(2).data);
		list.printList();
		
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.middleNode();
		list.reverse();
		list.printList();
	}

}
