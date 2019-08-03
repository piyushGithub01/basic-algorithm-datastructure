package com.tree.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class InorderTraversal1 {
	
	//The order of "inorder" is: left child -> parent -> right child

	public static void main(String[] args) {
		BinaryTreeNode tree = BinaryTreeSupplier.getBinaryTreeSample();
		List<Integer> result = new ArrayList<>();
		Stack<BinaryTreeNode> stack = new Stack<>();
		
		BinaryTreeNode p = tree;
		while(p != null) {
			stack.push(p);
			p = p.left;
		}
		BinaryTreeNode t;
		while(!stack.isEmpty()) {
			t = stack.pop();
			result.add(t.value);
			
			t = t.right;
			while(t != null) {
				stack.push(t);
				t = t.left;
			}
		}
		String expectedOrder = "4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90";
		System.out.println("Expected: " + expectedOrder);
		String actualOrder = result.stream().map(x -> x.toString()).collect(Collectors.joining(", "));
		System.out.println("Actual:   " + actualOrder);
	}

}
