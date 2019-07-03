package com.trie.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TrieNodeHashmap {
	
	char c;
	Map<Character, TrieNodeHashmap> children = new HashMap<>();
	boolean isWord;
	
	public TrieNodeHashmap() {}
	
	public TrieNodeHashmap(char c) {
		this.c = c;
	}
}
