package com.miscellaneous.geeks.linkedList.groupe.sorted;

import com.miscellaneous.geeks.linkedList.groupa.Node;

public class B1Intersection {
	
	private void findIntersection(Node head1, Node head2) {
		int length1=0, length2=0, diff;
		
		Node node1 = head1, node2 = head2;
		while(node1 != null) {
			length1++;
			node1 = node1.next;
		}
		
		while(node2 != null) {
			length2++;
			node2 = node2.next;
		}
		int big = 1; diff = Math.abs(length1-length2);
		
		node1 = length1>length2 ? head1 : head2;
		node2 = length1>length2 ? head2 : head1;
		while(big <= diff) {
			node1 = node1.next;
			big++;
		}
		while(node2 != null && node1 != null) {
			if(node1 == node2) {
				System.out.println("The intersecting node is :: " + node1.data);
				break;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		if(node2.next == null) {
			System.out.println("No intersecting node is present ");
		}
	}

	public static void main(String[] args) {
		B1Intersection ll1 = new B1Intersection();
		Node head1 = new Node(10);
		ll1.insertNode(head1, 20);
		ll1.insertNode(head1, 30);
		ll1.insertNode(head1, 40);
		ll1.insertNode(head1, 50);
		Node insersection1 = ll1.insertNode(head1, 60);
		ll1.insertNode(head1, 70);
		ll1.insertNode(head1, 80);
		
		B1Intersection ll2 = new B1Intersection();
		Node head2 = new Node(1);
		Node insersection2 = ll2.insertNode(head2, 2);
		insersection2.next = (insersection1);
		
		ll1.print(head1);
		ll2.print(head2);
		ll1.findIntersection(head1, head2);
	}
	
	private Node insertNode(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		} else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = (temp);
		}
		return temp;
	}
	
	private void print(Node head) {
		if(head == null) {
			System.out.println("Linked list is empty");
		} else {
			Node temp = head;
			do {
				System.out.print(" --> " + temp.data);
				temp = temp.next;
			} while(temp != head && temp != null);
			System.out.println();
		}
	}

}
