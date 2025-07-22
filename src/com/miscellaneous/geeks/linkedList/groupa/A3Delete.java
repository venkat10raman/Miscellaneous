package com.miscellaneous.geeks.linkedList.groupa;

public class A3Delete {
	
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
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head.getNext();
			head = null;
			head = temp;
		}
	}
	
	private void deleteTail() {
		if(head == null) {
			System.out.println("List is empty");
		} else if(head.getNext() == null) {
			head = null;
		} else {
			Node curr = head;
			while(curr.getNext().getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(null);
		}
	}
	
	private void delete(int index) {
		if(head == null) {
			System.out.println("List is empty");
		} else if(index == 0) {
			head = null;
		} else {
			int position = 1;
			Node node = head;
			while(node.getNext().getNext() != null && position < index) {
				position++;
				node = node.getNext();
			}
			if(index > position) {
				System.out.println("Index outofbound");
			} else {
				node.setNext(node.getNext().getNext());
			}
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

	public static void main(String[] args) {
		A3Delete ll = new A3Delete();
		ll.deleteHead();
		ll.deleteTail();
		ll.insert(10);
		ll.deleteTail();
		
		ll.insert(10);
		ll.insert(10);
		ll.insert(10);
		ll.insert(10);
		ll.insert(10);
		ll.deleteTail();
		ll.print();
		ll.delete(3);
		ll.delete(1);
		ll.delete(1);
		ll.delete(0);
		ll.print();
		
	}

}
