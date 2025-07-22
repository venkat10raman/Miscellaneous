package com.miscellaneous.geeks.tree;

public class A7BTreeSize {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		int size = btreeSize(root);
		System.out.println("Size of the tree :: " + size);
	}

	private static int btreeSize(BNode node) {
		if(node == null) {
			return 0;
		}
		return btreeSize(node.getLeft()) + btreeSize(node.getRight()) + 1;
	}

}
