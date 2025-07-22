package com.miscellaneous.geeks.tree;

public class A2Height {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		int height = getTreeHeight(root);
		System.out.println("Binary Tree Height :: " + height);
		root.getLeft().getLeft().setLeft(new BNode(5));
		height = getTreeHeight(root);
		System.out.println("Binary Tree Height :: " + height);
		root.getLeft().getLeft().getLeft().setLeft(new BNode(4));
		height = getTreeHeight(root);
		System.out.println("Binary Tree Height :: " + height);
		
	}

	private static int getTreeHeight(BNode node) {
		if(node == null) {
			return 0;
		}
		return Math.max(getTreeHeight(node.getLeft()), getTreeHeight(node.getLeft())) + 1;
	}

}
