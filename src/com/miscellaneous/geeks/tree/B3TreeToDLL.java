package com.miscellaneous.geeks.tree;

import com.miscellaneous.geeks.linkedList.groupb.doublee.DNode;

public class B3TreeToDLL {
	
	private static BNode prev = null;

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		
		BNode head = btreeToDoubleLinkedList(root);
		BNode curr = head;
		while (curr != null) {
			System.out.print(curr.getData() + " ");
			prev = curr;
			curr = curr.getRight();
			
		}
		
		System.out.println();
		while (prev != null) {
			System.out.print(prev.getData() + " ");
			prev = prev.getLeft();
		}
	}

	private static BNode btreeToDoubleLinkedList(BNode root) {
		if(root == null) return root;
		BNode head = btreeToDoubleLinkedList(root.getLeft());
		
		if(prev == null) {
			head = root;
		} else {
			root.setLeft(prev);
			prev.setRight(root);
		}
		prev = root;
		btreeToDoubleLinkedList(root.getRight());
		return head;
	}

}
