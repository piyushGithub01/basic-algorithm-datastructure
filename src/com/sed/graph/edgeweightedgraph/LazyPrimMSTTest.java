package com.sed.graph.edgeweightedgraph;

import java.util.LinkedList;

public class LazyPrimMSTTest {

	public static void main(String[] args) {
		EdgeWeightedGraph ed = EdgeWeightedGraphProvider.provideSmall();
		LazyPrimMST lp = new LazyPrimMST(ed);
		LinkedList<Edge> mstEdges = lp.getMSTEdges();
		for(Edge e: mstEdges) {
			System.out.println(e);
		}
	}
}
