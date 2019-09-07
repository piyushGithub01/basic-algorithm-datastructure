package com.sed.graph.undirected;

public class IsBiPartite {
	
	private boolean[] marked;
	private boolean[] color;
	private boolean isBiPartite;
	
	public boolean isBiPartiteGraph() {
		return isBiPartite;
	}
	
	public IsBiPartite(GraphAdjList g) {
		marked = new boolean[g.getVertexCount()];
		color = new boolean[g.getVertexCount()];
		isBiPartite = true; 
		for(int i=0; i<g.getVertexCount(); i++) {
			if(!marked[i]) {
				dfs(g, i);
			}
		}
	}
	
	private void dfs(GraphAdjList g, int v) {
		marked[v] = true;
		for(int w: g.getAdjListOf(v)) {
			if(!marked[w]) {
				color[w] = !color[v];
				dfs(g, w);
			} else {
				if(color[w] == color[v]) {
					isBiPartite = false;
				}
			}
		}
	}
	

}
