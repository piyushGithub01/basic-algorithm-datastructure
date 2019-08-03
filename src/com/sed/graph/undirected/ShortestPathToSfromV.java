package com.sed.graph.undirected;

import java.util.LinkedList;
import java.util.Stack;

public class ShortestPathToSfromV {
	
	private boolean[] hasPath;
	private int[] root;
	private final int source;
	
	public ShortestPathToSfromV(GraphAdjList g, int source) {
		this.source = source;
		hasPath = new boolean[g.getVertexCount()];
		root = new int[g.getVertexCount()];
		bfs(g, source);
	}
	
	private void bfs(GraphAdjList g, int v) {
		LinkedList<Integer> q = new LinkedList<>();
		hasPath[v] = true;
		q.offer(v);
		while(!q.isEmpty()) {
			v = q.poll();
			for(int w : g.getAdjListOf(v)) {
				if(!hasPath(w)) {
					hasPath[w] = true;
					root[w] = v;
					q.offer(w);	
				}
			}
		}
	}
	
	public boolean hasPath(int v) {
		return hasPath[v];
	}
	
	public Stack<Integer> pathTo(int v) {
		Stack<Integer> path = new Stack<>();
		int r = v;
		while(r != source) {
			path.push(r);
			r = root[r];
		}
		path.push(source);
		return path;
	}

}
