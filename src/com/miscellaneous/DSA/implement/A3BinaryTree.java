package com.miscellaneous.DSA.implement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class A3BinaryTree {

	private TreeNode root;

	static class TreeNode {
		private int data;
		private TreeNode left,right;

		public TreeNode(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	// Insert a node into the binary tree (basic implementation)
	public TreeNode insert(int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		return insert(root, data);
	}

	public TreeNode insert(TreeNode node, int data) {
		if(node == null) {
			return new TreeNode(data);
		}
		if(data < node.data) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}
		return node;
	}

	// Inorder traversal (Left, Root, Right)
	public void inorder() {
		inorder(root);
		System.out.println();
	}

	public void inorder(TreeNode node) {
		if(node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}

	// Preorder traversal (Root, Left, Right)
	public void preorder() {
		preorder(root);
		System.out.println();
	}

	public void preorder(TreeNode node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
	}

	// Postorder traversal (Left, Right, Root)
	public void postorder() {
		postorder(root);
		System.out.println();
	}

	public void postorder(TreeNode node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " ");
		}
	}

	// Search a node in the tree
	public boolean search(int key) {
		return search(root,key);
	}

	public boolean search(TreeNode node, int key) {
		if(node == null) return false;
		if(node.data == key) return true;
		return node.data > key ? search(node.left, key) : search(node.right, key);
	}

	public void deleteNode(int key) {
		deleteNode(root, key);
	}

	public TreeNode deleteNode(TreeNode node, int key) {
		if(node == null) return null;
		if(key < node.data) {
			node.left = deleteNode(node.left, key);
		} else if(key > node.data) {
			node.right = deleteNode(node.right, key);
		} else {
			// Case 1 & 2: Node with one child or no child
			if(node.left == null) return node.right;
			if(node.right == null) return node.left;

			// Case 3: Node with two children
			TreeNode minimumInorderSuccessor = findMinInorderSuccessor(node.right);
			node.data = minimumInorderSuccessor.data;
			node.right = deleteNode(node.right, minimumInorderSuccessor.data);
		}
		return node;
	}

	private TreeNode findMinInorderSuccessor(TreeNode node) {
		while (node.left != null) node = node.left;
		return node;
	}

	private void findLCA(int p, int q) {
		TreeNode node = findLCA(root, p, q);
		StringBuilder sb = new StringBuilder();
		sb.append("LCA of ").append(p).append(" and ")
		.append(q).append(" is ::: ").append(node.data);
		System.out.println(sb.toString());
	}

	private TreeNode findLCA(TreeNode node, int p, int q) {
		if (node == null || node.data == p || node.data == q) {
			return node;
		}

		TreeNode left = findLCA(node.left, p, q);
		TreeNode right = findLCA(node.right, p, q);

		if (left != null && right != null) {
			return node; 
			// If p and q are found in different subtrees, root is LCA
		}

		return (left != null) ? left : right;
		// Return the non-null subtree
	}

	// Validate if a tree is a BST
	private boolean isValidBST() {
		return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValidBSTHelper(TreeNode node, long min, long max) {
		if(node == null) return true;
		if(node.data <= min || node.data >= max) return false;
		return isValidBSTHelper(node.left, min, node.data) && isValidBSTHelper(node.right, node.data, max);
	}

	// Find kth smallest element in BST
	private int kthSmallest(int k) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while(true) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			if(--k == 0) return node.data;
			node = node.right;
		}
	}
	
	// Serialize a binary tree to a string
	private String serialize() {
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
		A3BinaryTree tree = new A3BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder Traversal:");
		tree.inorder(tree.root);

		System.out.println("\nPreorder Traversal:");
		tree.preorder(tree.root);

		System.out.println("\nPostorder Traversal:");
		tree.postorder(tree.root);

		System.out.println("\nSearch 40: " + tree.search(40)); // true
		System.out.println("Search 90: " + tree.search(90)); // false

		tree.findLCA(60, 80);

		tree.deleteNode(50);
		tree.inorder();
		tree.deleteNode(30);
		tree.inorder();

		tree.findLCA(60, 80);

		int k = 3;
		System.out.println("\nThe " + k + "rd smallest element is: " + tree.kthSmallest(k));

		System.out.println("\nIs the tree a valid BST? " + tree.isValidBST());
		
		// Serialization and De-serialization
        String serializedTree = tree.serialize();
        System.out.println("\nSerialized Tree: " + serializedTree);
        
        TreeNode deserializedRoot = tree.deserialize(serializedTree);
        System.out.println("Deserialization successful, root value: " + deserializedRoot.data);
	}

}
