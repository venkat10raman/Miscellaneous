
package com.miscellaneous.geeks.tree;

public class A8BTreeMaximum {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		System.out.println("Maximum of BTree :: " + maximum(root));
	}
	
	private static int maximum(BNode node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(node.data, Math.max(maximum(node.left), maximum(node.right)));
	}

}
