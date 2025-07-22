package com.miscellaneous.geeks.tree;

public class B2CheckBalance {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		
		int result = checkBalance(root);
		if(result < 0) {
			System.out.println("BTree is unbalanced");
		} else {
			System.out.println("BTree is balanced and having height :: " + result);
		}
		
	}

	private static int checkBalance(BNode root) {
		if(root == null) return 0;
		int lh = checkBalance(root.getLeft());
		if(lh == -1) return lh;
		
		int rh = checkBalance(root.getRight());
		if(rh == -1) return rh;
		
		if(Math.abs(lh-rh) > 1) return -1;
		return Math.max(lh, rh)+1;
	}

}
