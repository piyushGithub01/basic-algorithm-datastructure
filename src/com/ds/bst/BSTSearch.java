package com.ds.bst;

public class BSTSearch {

	public static void main(String[] args) {
		BSTSearch bsts = new BSTSearch();
		BSTNode root = BSTUtil.provideBST1();
		bsts.search(root, 20);
		bsts.search(root, 10);
	}
	
	private void search(BSTNode root, int value) {
		if(root == null) {
			System.out.println(value + " not found");
		} else if(value > root.key) {
			search(root.right, value);
		} else if(value < root.key) {
			search(root.left, value);
		} else if(root.key == value) {
			System.out.println(value + " found");
		}
		
	}

}
