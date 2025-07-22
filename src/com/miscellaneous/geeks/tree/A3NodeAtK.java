package com.miscellaneous.geeks.tree;

public class A3NodeAtK {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		
		nodeAtKthDistance(root,2);
	}

	private static void nodeAtKthDistance(BNode node, int k) {
		if(node != null) {
			if(k==0) {
				System.out.println(node.getData());
			} else {
				nodeAtKthDistance(node.getLeft(), k-1);
				nodeAtKthDistance(node.getRight(), k-1);
			}
		}
	}

}
