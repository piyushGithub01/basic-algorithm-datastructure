package com.sed.graph.undirected;

import java.util.Stack;

public class PathToVfromS {
	
	private boolean[] hasPath;
	private int[] root;
	private final int source;
	
	public PathToVfromS(GraphAdjList g, int source) {
		hasPath = new boolean[g.getVertexCount()];
		root = new int[g.getVertexCount()];
		this.source = source;
		dfs(g, source, source);
	}
	
	private void dfs(GraphAdjList g, int v, int u) {
		hasPath[v] = true;
		root[v] = u;
		for(int w : g.getAdjListOf(v)) {
			if(!hasPath[w]) {
				dfs(g, w, v);
			}
		}
	}
	
	public boolean hasPathTo(int v) {
		return hasPath[v];
	}
	
	public Stack<Integer> pathTo(int v) {
		Stack<Integer> path = new Stack<>();
		if(hasPath[v]) {
			int r = v;
			while(r != source) {
				path.push(r);
				r = root[r];
			}
			path.push(source);
		}
		return path;
	}

}
