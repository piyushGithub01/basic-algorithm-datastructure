package com.sed.graph.undirected;

import java.util.Stack;

public class PathToVfromSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAdjList g = GraphAdjListProvider.getGraph();
		PathToVfromSTest pst = new PathToVfromSTest();
		pst.printPath(g, 0, 1);
		pst.printPath(g, 0, 6);
		pst.printPath(g, 0, 5);
		pst.printPath(g, 0, 3);
		pst.printPath(g, 0, 4);
		pst.printPath(g, 0, 2);
		
//		Has path - printing
//		1 0 
//		Has path - printing
//		6 4 5 0 
//		Has path - printing
//		5 0 
//		Has path - printing
//		3 4 5 0 
//		Has path - printing
//		4 5 0 
//		Has path - printing
//		2 0 
	}
	
	private void printPath(GraphAdjList g, int source, int dest) {
		PathToVfromS ps = new  PathToVfromS(g, source);
		if(ps.hasPathTo(dest)) {
			System.out.println("Has path - printing");
			Stack<Integer> path = ps.pathTo(dest);
			for(int i : path) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("No path exists between " + source + " and " + dest);
		}
		System.out.println("");
	}

}
