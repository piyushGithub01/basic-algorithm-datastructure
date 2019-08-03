package com.sed.graph.undirected;

public class ConnectionToSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAdjList g = GraphAdjListProvider.getGraph();
		ConnectionToSearchTest cst = new ConnectionToSearchTest();
		cst.checkConectivity(g, 0);
		cst.checkConectivity(g, 9);
	}
	
	private void checkConectivity(GraphAdjList g, int in) {
		ConnectionToSearch cs = new ConnectionToSearch(g, in);
		System.out.println("Connection of " + in);
		for(int v=0; v<g.getVertexCount(); v++) {
			if(cs.isVisited(v)) {
				System.out.print(v + " ");
			}
		}
		System.out.println("");
		System.out.println("Is " + in + " fully connceted ?");
		if(cs.getConnectionCount() != g.getVertexCount()) {
			System.out.print("NOT ");
		}
		System.out.println("Fully Conncted");
	}

}
