package com.miscellaneous.geeks.tree;

public class B1ChildSum {

	public static void main(String[] args) {
		BNode root = new BNode(20);
		root.left = (new BNode(8));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(3));
		root.right.right = (new BNode(9));
		
		boolean isChildSum = childSum(root);
		System.out.println("Btree isChildSum :: " + isChildSum);
	}
	
	private static boolean childSum(BNode node) {
		if(node == null) return true;
		
		if(node.left == null && node.right == null) {
			return true;
		}
		int sum  = 0;
		if(node.left != null) {
			sum = sum + node.left.data;
		}
		
		if(node.right != null) {
			sum = sum + node.right.data;
		}
		
		return (node.data == sum && childSum(node.left) && childSum(node.right));
	}

}
