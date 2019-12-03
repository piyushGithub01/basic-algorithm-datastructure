package com.sed.graph.directed;

import java.util.Stack;

public class TopologicalSort {

	public static void main(String[] args) {
		DiGraph dg1 = DiGraphProvider.provideDAG();
		DiGraph dg2 = DiGraphProvider.provideCyclic();
		TopologicalSort ts = new TopologicalSort();
		ts.printTopologicalSort(dg1);
		ts.printTopologicalSort(dg2);
	}
	
	private void printTopologicalSort(DiGraph dg) {
		DirectedCycle dc = new DirectedCycle(dg);
		if(!dc.hasCycle()) {
			DepthFirstOrder dfo = new DepthFirstOrder(dg);
			Iterable<Integer> topologicalOrder = dfo.getReversePostOrder(); 
			Stack<Integer> s = new Stack<>();
			for(int i: topologicalOrder) {
				s.push(i);
			}
			printReversePost(s);
		} else {
			System.out.println("Topological Order not possible as Graph has cycle");
		}
	}
	
	private void printReversePost(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
		System.out.println();
	}

}
