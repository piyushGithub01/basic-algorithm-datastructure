package com.sed.graph.undirected;

public class IsBiPartiteTest {

	public static void main(String[] args) {
		GraphAdjList g = GraphAdjListProvider.getGraph();
		IsBiPartite ibp = new IsBiPartite(g);
		System.out.print("is graph bipartite - " + ibp.isBiPartiteGraph());
	}

}
