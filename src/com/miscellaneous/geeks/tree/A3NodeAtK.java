package com.miscellaneous.geeks.tree;

public class A3NodeAtK {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		
		nodeAtKthDistance(root,2);
	}

	private static void nodeAtKthDistance(BNode node, int k) {
		if(node != null) {
			if(k==0) {
				System.out.println(node.data);
			} else {
				nodeAtKthDistance(node.left, k-1);
				nodeAtKthDistance(node.right, k-1);
			}
		}
	}

}
