package com.sed.graph.directed;

public class DiGraphProvider {
	
	public static DiGraph provideCyclic() {
		DiGraph dg = new DiGraph(13);
		dg.addEdge(4, 2);
		dg.addEdge(2, 3);
		dg.addEdge(3, 2);
		dg.addEdge(6, 0);
		dg.addEdge(0, 1);
		dg.addEdge(2, 0);
		dg.addEdge(11, 12);
		dg.addEdge(12, 9);
		dg.addEdge(9, 10);
		dg.addEdge(9, 11);
		dg.addEdge(8, 9);
		dg.addEdge(10, 12);
		dg.addEdge(11, 4);
		dg.addEdge(4, 3);
		dg.addEdge(3, 5);
		dg.addEdge(7, 8);
		dg.addEdge(8, 7);
		dg.addEdge(5, 4);
		dg.addEdge(0, 5);
		dg.addEdge(6, 4);
		dg.addEdge(6, 9);
		dg.addEdge(7, 6);
		return dg;
	}
	
	public static DiGraph provideDAG() {
		DiGraph dg = new DiGraph(13);
		dg.addEdge(0, 1);
		dg.addEdge(0, 5);
		dg.addEdge(0, 6);
		dg.addEdge(2, 0);
		dg.addEdge(2, 3);
		dg.addEdge(3, 5);
		dg.addEdge(5, 4);
		dg.addEdge(6, 4);
		dg.addEdge(6, 9);
		dg.addEdge(7, 6);
		dg.addEdge(8, 7);
		dg.addEdge(9, 10);
		dg.addEdge(9, 11);
		dg.addEdge(9, 12);
		dg.addEdge(11, 12);
		return dg;
	}

}
