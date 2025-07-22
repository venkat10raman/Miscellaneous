package com.miscellaneous.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class A5LevelOrder {

	public static void main(String[] args) {
		BNode root = new BNode(10);
		root.setLeft(new BNode(8));
		root.getLeft().setRight(new BNode(9));
		root.getLeft().setLeft(new BNode(7));
		
		
		root.setRight(new BNode(12));
		root.getRight().setLeft(new BNode(11));
		root.getRight().setRight(new BNode(13));
		levelOrderTraversal(root);
	}

	private static void levelOrderTraversal(BNode node) {
		if(node == null) return;
		Queue<BNode> que = new LinkedList<>();
		que.add(node);
		que.add(null);
		while(que.size() > 1) {
			BNode curr = que.poll();
			if(curr == null) {
				System.out.println();
				que.add(null);
				continue;
			};
			System.out.print(curr.getData() + " ");
			if(curr.getLeft() != null) que.add(curr.getLeft());
			if(curr.getRight() != null) que.add(curr.getRight());
		}
	}
}
