package com.sed.graph.edgeweightedgraph;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LazyPrimMST {
	
	private boolean[] visited;
	private LinkedList<Edge> mst;
	private PriorityQueue<Edge> pq;
	
	public LazyPrimMST(EdgeWeightedGraph ed) {
		visited = new boolean[ed.getVertexCount()];
		pq = new PriorityQueue<>();
		mst = new LinkedList<>();
		
		visit(ed, 0);
		while(!pq.isEmpty()) {
			Edge edge = pq.remove();
			int v = edge.getEither(); int w= edge.getOther(v);
			if(visited[v] && visited[w]) {
				continue;
			}
			mst.add(edge);
			if(!visited[v]) {
				visit(ed, v);
			}
			if(!visited[w]) {
				visit(ed, w);
			}
		}
	}
	
	private void visit(EdgeWeightedGraph gh, int v) {
		visited[v] = true;
		for(Edge e: gh.getAdjList(v)) {
			if(!visited[e.getOther(v)]) {
				pq.add(e);
			}
		}
	}
	
	public LinkedList<Edge> getMSTEdges() {
		return mst;
	}
	
	public double getMSTWeight() {
		return 0;
	}

}
