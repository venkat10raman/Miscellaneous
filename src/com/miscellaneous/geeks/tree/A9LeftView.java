package com.miscellaneous.geeks.tree;

public class A9LeftView {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		
		leftView(root, 1, new int[] {0});
	}

	private static void leftView(BNode node, int level, int[] maxLevel) {
		if(node == null) {
			return;
		}
		if(maxLevel[0] < level) {
			System.out.print(node.getData() + " ");
			maxLevel[0] = level;
		}
		leftView(node.getLeft(), level+1, maxLevel);
		leftView(node.getRight(), level+1, maxLevel);
	}

}
