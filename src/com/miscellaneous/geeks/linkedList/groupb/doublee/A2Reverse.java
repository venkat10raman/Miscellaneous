package com.miscellaneous.geeks.linkedList.groupb.doublee;

public class A2Reverse {
	
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
	
	private void reverse() {
		if(head == null) {
			System.out.println("The list is empty");
		} else {
			
			DNode curr = head;
			DNode prev = null;
			DNode next = null;
			tail = curr;
			while(curr != null) {
				prev = curr.getPrevious();
				next = curr.getNext();
				curr.setPrevious(next);
				curr.setNext(prev);
				curr = next;
			}
			head = prev.getPrevious();
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

	public static void main(String[] args) {
		A2Reverse dll = new A2Reverse();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.insert(4);
		dll.insert(5);
		dll.print();
		dll.reverse();
		dll.print();
	}

}
