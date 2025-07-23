package com.miscellaneous.geeks.tree;

public class A1Inorder {
	
	

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
	}

	private static void postorder(BNode node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " --> ");
		}
	}

	private static void inorder(BNode node) {
		if(node != null) {
			inorder(node.left);
			System.out.print(node.data + " --> ");
			inorder(node.right);
		}
		
	}
	
	private static void preorder(BNode node) {
		if(node != null) {
			System.out.print(node.data + " --> ");
			preorder(node.left);
			preorder(node.right);
		}
	}

}
