package com.sed.graph.directed;

import java.util.Stack;

public class DirectedCycleTest {

	public static void main(String[] args) {
		DirectedCycleTest dct = new DirectedCycleTest();
		DiGraph dg1 = DiGraphProvider.provideDAG();
		DiGraph dg2 = DiGraphProvider.provideCyclic();
		dct.printCycle(dg1);
		dct.printCycle(dg2);
	}
	
	private void printCycle(DiGraph dg) {
		DirectedCycle dc = new DirectedCycle(dg);
		if(!dc.hasCycle()) {
			System.out.println("Graph has no cycle");
		} else {
			Stack<Integer> cycle = dc.cycle();
			System.out.print("Graph cycle is : ");
			for(int i : cycle) {
				System.out.print(i + ", ");
			}
			System.out.println("");
		}
	}

}
