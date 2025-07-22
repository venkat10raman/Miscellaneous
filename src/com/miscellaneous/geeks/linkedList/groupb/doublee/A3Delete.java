package com.miscellaneous.geeks.linkedList.groupb.doublee;

public class A3Delete {
	
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
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			head = head.getNext();
		}
	}
	
	private void deleteTail() {
		if(head == null) {
			System.out.println("The list is empty");
		} if(head.getNext() == null) {
			head = null;
		} else {
			DNode node = head;
			while(node.getNext().getNext() != null) {
				node = node.getNext();
			}
			node.setNext(null);
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
				System.out.print(" --> " + temp.getData());
				temp = temp.getNext();
			}
			System.out.println();
		}
	}

}
