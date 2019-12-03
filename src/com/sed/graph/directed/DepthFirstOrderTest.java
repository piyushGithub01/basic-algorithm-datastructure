package com.sed.graph.directed;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstOrderTest {

	public static void main(String[] args) {
		DiGraph dg = DiGraphProvider.provideDAG();
		DepthFirstOrderTest dfot = new DepthFirstOrderTest();
		dfot.checkOrders(dg);
	}
	
	private void checkOrders(DiGraph dg) {
		DepthFirstOrder dfo = new DepthFirstOrder(dg);
		System.out.println("Expected Pre Order: " + "0 5 4 1 6 9 11 12 10 2 3 7 8");
		System.out.print("Actual Pre Order: ");
		LinkedList<Integer> pre = dfo.getPreOrder();
		printOrder(pre);
		System.out.println("Expected Post Order: " + "4 5 1 12 11 10 9 6 0 3 2 7 8");
		System.out.print("Actual Post Order: ");
		LinkedList<Integer> post = dfo.getPostOrder();
		printOrder(post);
		System.out.println("Expected ReversePost Order: " + "8 7 2 3 0 6 9 10 11 12 1 5 4");
		System.out.print("Actual ReversePost Order: ");
		Iterable<Integer> reversePost = dfo.getReversePostOrder();
		Stack<Integer> s = new Stack<>();
		for(int i : reversePost) {
			s.push(i);
		}
		printReversePost(s);
	}
	
	private void printOrder(Iterable<Integer> it) {
		for(int i: it) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private void printReversePost(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
		System.out.println();
	}

}
