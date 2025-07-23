package com.miscellaneous.geeks.tree;

import com.miscellaneous.geeks.linkedList.groupb.doublee.DNode;

public class B3TreeToDLL {
	
	private static BNode prev = null;

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		
		BNode head = btreeToDoubleLinkedList(root);
		BNode curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			prev = curr;
			curr = curr.right;
			
		}
		
		System.out.println();
		while (prev != null) {
			System.out.print(prev.data + " ");
			prev = prev.left;
		}
	}

	private static BNode btreeToDoubleLinkedList(BNode root) {
		if(root == null) return root;
		BNode head = btreeToDoubleLinkedList(root.left);
		
		if(prev == null) {
			head = root;
		} else {
			root.left = (prev);
			prev.right = (root);
		}
		prev = root;
		btreeToDoubleLinkedList(root.right);
		return head;
	}

}
