package com.miscellaneous.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class A4LevelOrder {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.left = (new BNode(8));
		root.left.right = (new BNode(9));
		root.left.left = (new BNode(7));
		
		
		root.right = (new BNode(12));
		root.right.left = (new BNode(11));
		root.right.right = (new BNode(13));
		
		levelOrderTraversal(root);
	}

	private static void levelOrderTraversal(BNode node) {
		if(node == null) return;
		Queue<BNode> que = new LinkedList<>();
		que.add(node);
		while(!que.isEmpty()) {
			BNode curr = que.poll();
			System.out.print(curr.data + " -> ");
			if(curr.left != null) que.add(curr.left);
			if(curr.right != null) que.add(curr.right);
		}
	}

}
