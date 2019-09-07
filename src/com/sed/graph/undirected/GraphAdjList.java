package com.sed.graph.undirected;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GraphAdjList {
	
	private final int vertexCount;
	private int edgeCount;
	private List<Integer> adj[];
	
	public GraphAdjList(int vertexCount) {
		this.vertexCount = vertexCount;
		adj = new LinkedList[vertexCount];
		for(int i=0; i<vertexCount; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		edgeCount++;
	}
	
	public List<Integer> getAdjListOf(int v) {
		return Collections.unmodifiableList(adj[v]);
	}
	
	public int getVertexCount() {
		return this.vertexCount;
	}
	
	public int getEdgeCount() {
		return edgeCount;
	}
}
