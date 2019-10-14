package com.sed.graph.directed;

public class DirectedDFS {
	
	private boolean[] visited;
	
	public DirectedDFS(DiGraph dg, int source) {
		visited = new boolean[dg.getVertexCount()];
		dfs(dg, source);
	}
	
	private void dfs(DiGraph dg, int v) {
		visited[v] = true;
		for(int w: dg.getAdjList(v)) {
			if(!visited[w]) {
				dfs(dg, w);
			}
		}
	}
	
	public boolean isVisited(int w) {
		return visited[w];
	}

}
