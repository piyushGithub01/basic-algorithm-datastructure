package com.sed.graph.edgeweightedgraph;

public class EdgeWeightedGraphProvider {
	
	public static EdgeWeightedGraph provideSmall() {
		EdgeWeightedGraph ed = new EdgeWeightedGraph(8);
		ed.addEdge(new Edge(4, 5, 0.35));
		ed.addEdge(new Edge(4, 7, 0.37));
		ed.addEdge(new Edge(5, 7, 0.28));
		ed.addEdge(new Edge(0, 7, 0.16));
		ed.addEdge(new Edge(1, 5, 0.32));
		ed.addEdge(new Edge(0, 4, 0.38));
		ed.addEdge(new Edge(2, 3, 0.17));
		ed.addEdge(new Edge(1, 7, 0.19));
		ed.addEdge(new Edge(0, 2, 0.26));
		ed.addEdge(new Edge(1, 2, 0.36));
		ed.addEdge(new Edge(1, 3, 0.29));
		ed.addEdge(new Edge(2, 7, 0.34));
		ed.addEdge(new Edge(6, 2, 0.40));
		ed.addEdge(new Edge(3, 6, 0.52));
		ed.addEdge(new Edge(6, 0, 0.58));
		ed.addEdge(new Edge(6, 4, 0.93));
		return ed;
	}

}
