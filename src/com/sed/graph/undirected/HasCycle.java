package com.sed.graph.undirected;

public class HasCycle {
	
	private boolean[] marked;
	private boolean hasCycle;
	
	public HasCycle(GraphAdjList g) {
		marked = new boolean[g.getVertexCount()];
		for(int i=0; i<g.getVertexCount(); i++) {
			if(!marked[i]) {
				dfs(g, i, i);
			}
		}
	}
	
	private void dfs(GraphAdjList g, int v, int u) {
		marked[v] = true;
		for(int w: g.getAdjListOf(v)) {
			if(!marked[w]) {
				dfs(g, w, v);
			} else {
				if(w!=u) {
					hasCycle = true;
				}
			}
		}
	}
	
	public boolean hasCycle() {
		return hasCycle;
	}

}
