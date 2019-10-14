package com.sed.graph.directed;

import java.util.ArrayList;
import java.util.List;

public class DiGraph {
	
	private int vertexCount;
	private int edgeCount;
	private List<Integer> adjList[];
	
	public DiGraph(int vertexCount) {
		this.vertexCount = vertexCount;
		this.edgeCount = 0;
		this.adjList = new List[vertexCount];
		for(int i=0; i<vertexCount; i++) {
			adjList[i] = new ArrayList<Integer>();
		}
	}
	
	public int getVertexCount() {
		return this.vertexCount;
	}
	
	public int getEdgeCount() {
		return this.edgeCount;
	}
	
	public List<Integer> getAdjList(int v) {
		return adjList[v];
	}
	
	public void addEdge(int v, int w) {
		this.adjList[v].add(w);
		this.edgeCount++;
	}
	
	public DiGraph reverse() {
		DiGraph rev = new DiGraph(this.vertexCount);
		for(int v=0; v<this.vertexCount; v++) {
			for(int w: adjList[v]) {
				rev.addEdge(w, v);
			}
		}
		return rev;
	}

}
