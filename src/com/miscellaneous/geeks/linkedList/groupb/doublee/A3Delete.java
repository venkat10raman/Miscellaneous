package com.miscellaneous.geeks.linkedList.groupb.doublee;

public class A3Delete {
	
	private DNode head;
	private DNode tail;
	
	private void insert(int data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
		} else if(tail != null) {
			tail.next = (newNode);
			newNode.previous = (tail);
			tail = newNode;
		} else {
			DNode curr = head;
			
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = (newNode);
			newNode.previous = (curr);
			tail = newNode;
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			head = head.next;
		}
	}
	
	private void deleteTail() {
		if(head == null) {
			System.out.println("The list is empty");
		} if(head.next == null) {
			head = null;
		} else {
			DNode node = head;
			while(node.next.next != null) {
				node = node.next;
			}
			node.next = (null);
		}
	}

	public static void main(String[] args) {
		A3Delete dll = new A3Delete();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.insert(4);
		dll.insert(5);
		dll.print();
		dll.deleteHead();
		dll.print();
		dll.deleteTail();
		dll.print();
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			DNode temp = head;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
	}

}
