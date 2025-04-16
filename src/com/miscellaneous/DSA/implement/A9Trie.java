package com.miscellaneous.DSA.implement;

public class A9Trie {

	private TrieNode root;
	
	public A9Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode node = root;
		for(char ch : word.toCharArray()) {
			int index = ch - 'a';
			if(node.getLinks()[index] == null) {
				node.getLinks()[index] = new TrieNode();
			}
			node = node.getLinks()[index];
		}
		node.setEnd();
	}
	
	public TrieNode searchPrefix(String word) {
		TrieNode node = root;
		for(char ch : word.toCharArray()) {
			int index = ch - 'a';
			if(node.getLinks()[index] == null) {
				return null;
			}
			node = node.getLinks()[index];
		}
		return node;
	}
	
	public boolean search(String word) {
		TrieNode node = searchPrefix(word);
		return node != null && node.isEnd();
	}
	
	public boolean startsWith(String word) {
		TrieNode node = searchPrefix(word);
		return node != null;
	}

	public static void main(String[] args) {
		
		A9Trie trie = new A9Trie();

        // Insert words
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apricot");

        // Search for words
        System.out.println(trie.search("apple"));   // Output: true
        System.out.println(trie.search("app"));     // Output: true
        System.out.println(trie.search("appl"));    // Output: false
        System.out.println(trie.search("appe"));
        System.out.println(trie.search("ae"));

        // Check for prefixes
        System.out.println(trie.startsWith("ap"));  // Output: true
        System.out.println(trie.startsWith("ba"));  // Output: false
	}

}
