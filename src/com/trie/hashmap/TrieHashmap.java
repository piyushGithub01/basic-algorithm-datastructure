package com.trie.hashmap;

import java.util.Map;

public class TrieHashmap {
	
	TrieNodeHashmap root;
	
	public TrieHashmap() {
		root = new TrieNodeHashmap();
	}
	
	public static void main(String[] args) {
		TrieHashmap t = new TrieHashmap();
		t.insertWord("hello");
		t.searchWord("hello");
		t.searchWord("hell");
		t.searchWord("J");
	}
	
	public void insertWord(String word) {
		Map<Character, TrieNodeHashmap> children = root.children;
		TrieNodeHashmap node;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(children.containsKey(c)) {
				node = children.get(c);
			} else {
				node = new TrieNodeHashmap(c);
				children.put(c, node);
			}
			children = node.children;
			if(i == word.length()-1) {
				node.isWord = true;
			}
		}
	}
	
	public void searchWord(String word) {
		TrieNodeHashmap node = search(word);
		if(node != null && node.isWord) {
			System.out.println(word + " exists");
		} else {
			System.out.println(word + " does not exist");
		}
	}
	
	public TrieNodeHashmap search(String word) {
		TrieNodeHashmap node = null;
		Map<Character, TrieNodeHashmap> children = root.children;
		for(char c: word.toCharArray()) {
			if(children.containsKey(c)) {
				node = children.get(c);
				children = node.children;
			} else {
				break;
			}
		}
		return node;
	}

}
