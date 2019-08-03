package com.tree.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InorderTraversalRecursion {
	
	//The order of "inorder" is: left child -> parent -> right child

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode tree = BinaryTreeSupplier.getBinaryTreeSample();
		List<Integer> result = new ArrayList<>();
		InorderTraversalRecursion iot = new InorderTraversalRecursion();
		if(tree != null) {
			iot.inorderRecursion(tree, result);
		}
		String expectedOrder = "4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90";
		System.out.println("Expected: " + expectedOrder);
		String actualOrder = result.stream().map(x -> x.toString()).collect(Collectors.joining(", "));
		System.out.println("Actual:   " + actualOrder);
	}
	
	private void inorderRecursion(BinaryTreeNode root, List<Integer> result) {
		if(root.left != null) {
			inorderRecursion(root.left, result);
		}
		
		result.add(root.value);
		
		if(root.right != null) {
			inorderRecursion(root.right, result);
		}
	}

}
