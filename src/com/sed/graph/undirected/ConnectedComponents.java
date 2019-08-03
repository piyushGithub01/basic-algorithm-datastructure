package com.sed.graph.undirected;

public class ConnectedComponents {
	
	private boolean[] visited;
	private int[] compId;
	private int count;
	
	public ConnectedComponents(GraphAdjList g) {
		visited = new boolean[g.getVertexCount()];
		compId = new int[g.getVertexCount()];
		completeDFSscan(g);
	}
	
	private void completeDFSscan(GraphAdjList g) {
		for(int s=0; s<g.getVertexCount(); s++) {
			if(!visited[s]) {
				dfs(g, s);
				count++;
			}
		}
	}
	
	private void dfs(GraphAdjList g, int v) {
		visited[v] = true;
		compId[v] = count;
		for(int w : g.getAdjListOf(v)) {
			if(!visited[w]) {
				dfs(g, w);
			}
		}
	}
	
	public int getComponentCount() {
		return count;
	}
	
	public int getCompId(int v) {
		return compId[v];
	}
	
	public boolean isPartOfSameComp(int v, int w) {
		return compId[v] == compId[w];
	}

}
