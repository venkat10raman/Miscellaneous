package com.miscellaneous.DSA.implement;

public class TrieNode {

	private TrieNode[] links;
	private boolean isEnd;

	public TrieNode() {
		links = new TrieNode[26];
		isEnd = false;
	}
	
	public void setEnd() {
		isEnd = true;
	}
	public boolean isEnd() {
		return isEnd;
	}

	public TrieNode[] getLinks() {
		return links;
	}
	
}
