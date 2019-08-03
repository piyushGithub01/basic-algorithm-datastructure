package com.sed.graph.undirected;

public class PrintDFSOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAdjList g = GraphAdjListProvider.getGraph();
		PrintDFSOf pdfs = new PrintDFSOf();
		pdfs.printDFS(g, 0);
		pdfs.printDFS(g, 9);
	}
	
	private void printDFS(GraphAdjList g, int in) {
		boolean[] visited = new boolean[g.getVertexCount()];
		dfs(g, in, visited);
		System.out.println("");
	}
	
	private void dfs(GraphAdjList g, int v, boolean[] visited) {
		System.out.print(v + " ");
		visited[v] = true;
		for(int w : g.getAdjListOf(v)) {
			if(!visited[w]) {
				dfs(g, w, visited);
			}
		}
	}

}
