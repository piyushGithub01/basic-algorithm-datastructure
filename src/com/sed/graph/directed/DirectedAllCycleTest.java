package com.sed.graph.directed;

import java.util.List;
import java.util.Stack;

public class DirectedAllCycleTest {

	public static void main(String[] args) {
		DirectedAllCycleTest dct = new DirectedAllCycleTest();
		DiGraph dg1 = DiGraphProvider.provideDAG();
		DiGraph dg2 = DiGraphProvider.provideCyclic();
		dct.printAllCycle(dg1);
		dct.printAllCycle(dg2);
	}
	
	private void printAllCycle(DiGraph dg) {
		DirectedAllCycle dac = new DirectedAllCycle(dg);
		if(!dac.hasCycle()) {
			System.out.println("Graph has no cycle");
		} else {
			List<Stack<Integer>> allCycle = dac.allCycle();
			for(Stack<Integer> cycle : allCycle) {
				System.out.print("Graph cycle is : ");
				for(int i : cycle) {
					System.out.print(i + ", ");
				}
				System.out.println("");
			}
		}
	}

}
