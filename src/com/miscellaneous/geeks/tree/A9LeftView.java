package com.miscellaneous.geeks.tree;

public class A9LeftView {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		
		leftView(root, 1, new int[] {0});
	}

	private static void leftView(BNode node, int level, int[] maxLevel) {
		if(node == null) {
			return;
		}
		if(maxLevel[0] < level) {
			System.out.print(node.data + " ");
			maxLevel[0] = level;
		}
		leftView(node.left, level+1, maxLevel);
		leftView(node.right, level+1, maxLevel);
	}

}
