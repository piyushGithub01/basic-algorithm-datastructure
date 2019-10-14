package com.sed.graph.directed;

public class DirectedDFSTest {

	public static void main(String[] args) {
		DirectedDFSTest dfst = new DirectedDFSTest();
		DiGraph dg = DiGraphProvider.provideCyclic();
		dfst.testReachable(dg, 0, 1);
		dfst.testReachable(dg, 1, 0);
		dfst.testReachable(dg, 6, 12);
	}
	
	private void testReachable(DiGraph dg, int source, int w) {
		DirectedDFS ddfs = new DirectedDFS(dg, source);
		System.out.println("is " + w + " reachable from source " + source + " - " + ddfs.isVisited(w));
	}

}
