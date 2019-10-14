package com.ds.bst;

public class BSTUtil {
	
	public static BSTNode provideBST1() {
		BSTNode root = new BSTNode(50);
		BSTNode n20 = new BSTNode(20);
		BSTNode n30 = new BSTNode(30);
		BSTNode n40 = new BSTNode(40);
		BSTNode n60 = new BSTNode(60);
		BSTNode n70 = new BSTNode(70);
		BSTNode n80 = new BSTNode(80);
		
		n30.left = n20;
		n30.right = n40;
		n70.left = n60;
		n70.right = n80;
		root.left = n30;
		root.right = n70;
		
		printInorder(root);
		System.out.println();
		return root;
	}
	
	public static BSTNode provideInvalidBST1() {
		BSTNode root = new BSTNode(50);
		BSTNode n20 = new BSTNode(20);
		BSTNode n30 = new BSTNode(30);
		BSTNode n40 = new BSTNode(40);
		BSTNode n60 = new BSTNode(60);
		BSTNode n70 = new BSTNode(70);
		BSTNode n80 = new BSTNode(80);
		BSTNode n10 = new BSTNode(10);
		
		n30.left = n20;
		n30.right = n40;
		n60.right = n10;
		n70.left = n60;
		n70.right = n80;
		root.left = n30;
		root.right = n70;
		
		printInorder(root);
		System.out.println();
		return root;
	}
	
	public static void printInorder(BSTNode root) {
		if(root != null) {
			printInorder(root.left);
			System.out.print(root.key + " ");
			printInorder(root.right);
		}
	}
	
	

}
