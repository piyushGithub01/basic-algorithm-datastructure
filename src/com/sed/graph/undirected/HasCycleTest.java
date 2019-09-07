package com.sed.graph.undirected;

public class HasCycleTest {

	public static void main(String[] args) {
		GraphAdjList g = GraphAdjListProvider.getGraph();
		HasCycle hc = new HasCycle(g);
		System.out.print("does graph has cycle - " + hc.hasCycle());
	}

}
