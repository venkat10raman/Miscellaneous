package com.miscellaneous.geeks.linkedList.groupb.doublee;

public class A1Insert {
	
	private DNode head;
	private DNode tail;
	
	private void insert(int data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
		} else if(tail != null) {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
		} else {
			DNode curr = head;
			
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(newNode);
			newNode.setPrevious(curr);
			tail = newNode;
		}
	}
	
	private void insertHead(int data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head.setPrevious(newNode);
			head = newNode;
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			DNode temp = head;
			while(temp != null) {
				System.out.print(" --> " + temp.getData());
				temp = temp.getNext();
			}
			System.out.println();
		}
	}
	
	private void printReverse() {
		if(tail == null) {
			System.out.println("Linked list is empty");
		} else {
			DNode temp = tail;
			while(temp != null) {
				System.out.print(" --> " + temp.getData());
				temp = temp.getPrevious();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		A1Insert dll = new A1Insert();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.insert(4);
		dll.insert(5);
		dll.print();
		dll.printReverse();
		dll.insertHead(0);
		dll.print();
	}

}
