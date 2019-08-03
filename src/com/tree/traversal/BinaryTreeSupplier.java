package com.tree.traversal;

public class BinaryTreeSupplier {
	
	/**
	 * 											25
	 * 						15											50
	 * 			10					22						35						70
	 * 		4		12			18		24				31		44				66		90
	 * 
	 * inorder
	 * 4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90
	 * 
	 * preorder
	 * 25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90
	 * 
	 * postorder
	 * 4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25
	 * 
	 * @return root of binary tree node
	 */
	public static BinaryTreeNode getBinaryTreeSample() {
		BinaryTreeNode root = new BinaryTreeNode(25);
		BinaryTreeNode l2node1 = new BinaryTreeNode(15);
		BinaryTreeNode l2node2 = new BinaryTreeNode(50);
		BinaryTreeNode l3node1 = new BinaryTreeNode(10);
		BinaryTreeNode l3node2 = new BinaryTreeNode(22);
		BinaryTreeNode l3node3 = new BinaryTreeNode(35);
		BinaryTreeNode l3node4 = new BinaryTreeNode(70);
		BinaryTreeNode l4node1 = new BinaryTreeNode(4);
		BinaryTreeNode l4node2 = new BinaryTreeNode(12);
		BinaryTreeNode l4node3 = new BinaryTreeNode(18);
		BinaryTreeNode l4node4 = new BinaryTreeNode(24);
		BinaryTreeNode l4node5 = new BinaryTreeNode(31);
		BinaryTreeNode l4node6 = new BinaryTreeNode(44);
		BinaryTreeNode l4node7 = new BinaryTreeNode(66);
		BinaryTreeNode l4node8 = new BinaryTreeNode(90);
		root.left = l2node1;
		root.right = l2node2;
		l2node1.left = l3node1;
		l2node1.right = l3node2;
		l2node2.left = l3node3;
		l2node2.right = l3node4;
		l3node1.left = l4node1;
		l3node1.right = l4node2;
		l3node2.left = l4node3;
		l3node2.right = l4node4;
		l3node3.left = l4node5;
		l3node3.right = l4node6;
		l3node4.left = l4node7;
		l3node4.right = l4node8;
		return root;
	}

}
