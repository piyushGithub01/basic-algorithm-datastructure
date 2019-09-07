package com.sed.graph.undirected;

public class GraphProperties {

	public static void main(String[] args) {
		GraphAdjList g = GraphAdjListProvider.getGraph();
		GraphProperties gp = new GraphProperties();
		System.out.println("degree of vertex id 9 = " + gp.degreeOf(g, 9));
		System.out.println("max degree of graph is = " + gp.maxDegreeOfGraph(g));
		System.out.println("average degree of graph is = " + gp.averageDegreeOf(g));
		System.out.print("number of self loops are = " + gp.numberOfSelfLoops(g));
	}
	
	private int degreeOf(GraphAdjList g, int v) {
		int degree = 0;
		for(int w: g.getAdjListOf(v)) {
			degree++;
		}
		return degree;
	}
	
	private int maxDegreeOfGraph(GraphAdjList g) {
		int maxDegree = 0;
		int degree = 0;
		for(int i=0; i<g.getVertexCount(); i++) {
			degree = this.degreeOf(g, i);
			if(degree > maxDegree) {
				maxDegree = degree;
			}
		}
		return maxDegree;
	}
	
	private int averageDegreeOf(GraphAdjList g) {
		return 2 * g.getEdgeCount() / g.getVertexCount();
	}
	
	private int numberOfSelfLoops(GraphAdjList g) {
		int count = 0;
		for(int i = 0; i<g.getVertexCount(); i++) {
			for(int w: g.getAdjListOf(i)) {
				if(w == i) {
					count++;
				}
			}
		}
		return count/2;
	}

}
