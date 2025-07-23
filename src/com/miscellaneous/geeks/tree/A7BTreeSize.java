package com.miscellaneous.geeks.tree;

public class A7BTreeSize {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		int size = btreeSize(root);
		System.out.println("Size of the tree :: " + size);
	}

	private static int btreeSize(BNode node) {
		if(node == null) {
			return 0;
		}
		return btreeSize(node.left) + btreeSize(node.right) + 1;
	}

}
