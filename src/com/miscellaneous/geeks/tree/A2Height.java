package com.miscellaneous.geeks.tree;

public class A2Height {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		int height = getTreeHeight(root);
		System.out.println("Binary Tree Height :: " + height);
		root.left.left.left = (new BNode(5));
		height = getTreeHeight(root);
		System.out.println("Binary Tree Height :: " + height);
		root.left.left.left.left = (new BNode(4));
		height = getTreeHeight(root);
		System.out.println("Binary Tree Height :: " + height);
		
	}

	private static int getTreeHeight(BNode node) {
		if(node == null) {
			return 0;
		}
		return Math.max(getTreeHeight(node.left), getTreeHeight(node.left)) + 1;
	}

}
