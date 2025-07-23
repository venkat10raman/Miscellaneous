package com.miscellaneous.geeks.linkedList.groupa;

public class A3Delete {
	
	private Node head;
	
	private void insert(int data) {
		if(head == null) {
			head = new Node(data);
		} else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = new Node(data);
		}
	}
	
	private void deleteHead() {
		if(head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head.next;
			head = null;
			head = temp;
		}
	}
	
	private void deleteTail() {
		if(head == null) {
			System.out.println("List is empty");
		} else if(head.next == null) {
			head = null;
		} else {
			Node curr = head;
			while(curr.next.next != null) {
				curr = curr.next;
			}
			curr.next = null;
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
			while(node.next.next != null && position < index) {
				position++;
				node = node.next;
			}
			if(index > position) {
				System.out.println("Index outofbound");
			} else {
				node.next = node.next.next;
			}
		}
	}
	
	private void print() {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = head;
			while(temp != null) {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
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
