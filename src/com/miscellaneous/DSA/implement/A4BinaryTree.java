package com.miscellaneous.DSA.implement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class A4BinaryTree {

	TreeNode root;

	static class TreeNode {
		private int data;
		private TreeNode left,right;

		public TreeNode(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	// Insert a node into the binary tree (basic implementation)
	public TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	// Inorder traversal (Left, Root, Right)
	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// Preorder traversal (Root, Left, Right)
	public void preorder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	// Postorder traversal (Left, Right, Root)
	public void postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	// Search a node in the tree
	public boolean search(TreeNode root, int key) {
		if (root == null) return false;
		if (root.data == key) return true;
		return key < root.data ? search(root.left, key) : search(root.right, key);
	}

	// Find kth smallest element in BST
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<>();
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (--k == 0) return root.data;
			root = root.right;
		}
	}

	// Validate if a tree is a BST
	public boolean isValidBST(TreeNode root) {
		return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValidBSTHelper(TreeNode node, long min, long max) {
		if (node == null) return true;
		if (node.data <= min || node.data >= max) return false;
		return isValidBSTHelper(node.left, min, node.data) && isValidBSTHelper(node.right, node.data, max);
	}

	// Serialize a binary tree to a string
	private String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		serializeHelper(root, sb);
		return sb.toString();
	}

	private void serializeHelper(TreeNode node, StringBuilder sb) {
		if(node == null) {
			sb.append("null,");
			return;
		}
		sb.append(node.data).append(",");
		serializeHelper(node.left, sb);
		serializeHelper(node.right, sb);
	}

	// Deserialize string back to a binary tree
	private TreeNode deserialize(String data) {
		Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
		return deserializeHelper(nodes);
	}

	private TreeNode deserializeHelper(Queue<String> nodes) {
		String val = nodes.poll();
		if (val.equals("null")) return null;
		TreeNode node = new TreeNode(Integer.parseInt(val));
		node.left = deserializeHelper(nodes);
		node.right = deserializeHelper(nodes);
		return node;
	}

	public static void main(String[] args) {
		A4BinaryTree tree = new A4BinaryTree();
		tree.root = tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);

		System.out.println("Inorder Traversal:");
		tree.inorder(tree.root);

		System.out.println("\nPreorder Traversal:");
		tree.preorder(tree.root);

		System.out.println("\nPostorder Traversal:");
		tree.postorder(tree.root);

		System.out.println("\nSearch 40: " + tree.search(tree.root, 40)); // true
		System.out.println("Search 90: " + tree.search(tree.root, 90)); // false

		int k = 3;
		System.out.println("\nThe " + k + "rd smallest element is: " + tree.kthSmallest(tree.root, k));

		System.out.println("\nIs the tree a valid BST? " + tree.isValidBST(tree.root));

		// Serialization and Deserialization
		String serializedTree = tree.serialize(tree.root);
		System.out.println("\nSerialized Tree: " + serializedTree);

		TreeNode deserializedRoot = tree.deserialize(serializedTree);
		System.out.println("Deserialization successful, root value: " + deserializedRoot.data);
	}

}
