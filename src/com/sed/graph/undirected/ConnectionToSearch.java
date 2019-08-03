package com.sed.graph.undirected;

public class ConnectionToSearch {
	
	private boolean visited[];
	private int connectionCount;
	
	public ConnectionToSearch(GraphAdjList g, int source) {
		// TODO Auto-generated constructor stub
		visited = new boolean[g.getVertexCount()];
		dfs(g, source);
	}
	
	private void dfs(GraphAdjList g, int s) {
		visited[s] = true;
		connectionCount++;
		for(int v : g.getAdjListOf(s)) {
			if(!visited[v]) {
				dfs(g, v);
			}
		}
	}
	
	public int getConnectionCount() {
		return this.connectionCount;
	}
	
	public boolean isVisited(int v){
		return visited[v];
	}

}
