package com.sed.graph.directed;

import java.util.Stack;

public class DirectedBFSTest {

	public static void main(String[] args) {
		DirectedBFSTest bfst = new DirectedBFSTest();
		DiGraph dg = DiGraphProvider.provideCyclic();
		bfst.shortestPath(dg, 0, 1);
		bfst.shortestPath(dg, 1, 0);
		bfst.shortestPath(dg, 7, 4);
		bfst.shortestPath(dg, 8, 12);
	}
	
	private void shortestPath(DiGraph dg, int v, int w) {
		DirectedBFS bfs = new DirectedBFS(dg, v);
		Stack<Integer> path = bfs.path(w);
		if(path.isEmpty()) {
			System.out.println("no path from " + v + " to " + w);
		} else {
			System.out.print("shorted path from " + v + " to " + w + " : ");
			for(int i: path) {
				System.out.print(i + ", ");
			}
			System.out.println("");
		}
	}

}
