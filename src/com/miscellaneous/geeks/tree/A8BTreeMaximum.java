package com.miscellaneous.geeks.tree;

public class A8BTreeMaximum {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		System.out.println("Maximum of BTree :: " + maximum(root));
	}
	
	private static int maximum(BNode node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(node.getData(), Math.max(maximum(node.getLeft()), maximum(node.getRight())));
	}

}
