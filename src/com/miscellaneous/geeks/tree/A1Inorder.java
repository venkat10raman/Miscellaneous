package com.miscellaneous.geeks.tree;

public class A1Inorder {
	
	

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
	}

	private static void postorder(BNode node) {
		if(node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.getData() + " --> ");
		}
	}

	private static void inorder(BNode node) {
		if(node != null) {
			inorder(node.getLeft());
			System.out.print(node.getData() + " --> ");
			inorder(node.getRight());
		}
		
	}
	
	private static void preorder(BNode node) {
		if(node != null) {
			System.out.print(node.getData() + " --> ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}

}
