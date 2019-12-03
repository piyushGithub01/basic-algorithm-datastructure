package com.sed.graph.edgeweightedgraph;

import java.util.LinkedList;

public class EdgeWeightedGraph {
	
	private int vertexCount;
	private int edgeCount;
	private LinkedList<Edge>[] adjList;
	
	public EdgeWeightedGraph(int v) {
		this.vertexCount = v;
		this.edgeCount = 0;
		this.adjList = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adjList[i] = new LinkedList<Edge>();
		}
	}
	
	public void addEdge(Edge e) {
		int v = e.getEither();
		int w = e.getOther(v);
		adjList[v].add(e);
		adjList[w].add(e);
		edgeCount++;
	}
	
	public int getVertexCount() {
		return vertexCount;
	}
	
	public int getEdgeCount() {
		return edgeCount;
	}
	
	public LinkedList<Edge> getAdjList(int v) {
		return adjList[v];
	}
	
	public LinkedList<Edge> getAllEdges() {
		LinkedList<Edge> allEdges = new LinkedList<>();
		for(int i=0; i<vertexCount; i++) {
			for(Edge e: adjList[i]) {
				if(e.getOther(i) > i) {
					allEdges.add(e);
				}
			}
		}
		return allEdges;
	}

}
