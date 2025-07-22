package com.miscellaneous.geeks.tree;

public class B1ChildSum {

	public static void main(String[] args) {
		BNode root = new BNode(20);
		root.setLeft(new BNode(8));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(3));
		root.getRight().setRight(new BNode(9));
		
		boolean isChildSum = childSum(root);
		System.out.println("Btree isChildSum :: " + isChildSum);
	}
	
	private static boolean childSum(BNode node) {
		if(node == null) return true;
		
		if(node.getLeft() == null && node.getRight() == null) {
			return true;
		}
		int sum  = 0;
		if(node.getLeft() != null) {
			sum = sum + node.getLeft().getData();
		}
		
		if(node.getRight() != null) {
			sum = sum + node.getRight().getData();
		}
		
		return (node.getData() == sum && childSum(node.getLeft()) && childSum(node.getRight()));
	}

}
