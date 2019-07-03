package com.trie.array;

public class Trie {
	
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public static void main(String[] args) {
		Trie t = new Trie();
		t.insertWord("hello");
		t.searchWord("hello");
		t.searchWord("hell");
		t.searchWord("j");
	}
	
	public void insertWord(String word) {
		TrieNode node = root;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if(node.arr[index] == null) {
				TrieNode temp = new TrieNode();
				node.arr[index] = temp;
				node = temp;
			} else {
				node = node.arr[index];
			}
			if(i == word.length()-1) {
				node.isWord = true;
			}
		}
	}
	
	public void searchWord(String word) {
		TrieNode node = search(word);
		if(node != null && node.isWord) {
			System.out.println(word + " exists");
		} else {
			System.out.println(word + " does not exist");
		}
	}
	
	public TrieNode search(String word) {
		TrieNode t = root;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			t = t.arr[index];
			if(t == null) {
				break;
			}
		}
		return t;
	}

}
