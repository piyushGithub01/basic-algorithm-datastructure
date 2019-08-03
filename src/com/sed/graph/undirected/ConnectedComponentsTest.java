package com.sed.graph.undirected;

import java.util.LinkedList;
import java.util.List;

public class ConnectedComponentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAdjList g = GraphAdjListProvider.getGraph();
		ConnectedComponentsTest cct = new ConnectedComponentsTest();
		ConnectedComponents cc = new ConnectedComponents(g);
		cct.printGraphComponents(g, cc);
		cct.printInSameComp(cc, 0, 9);
		cct.printInSameComp(cc, 0, 6);
		cct.printInSameComp(cc, 11, 9);
		cct.printInSameComp(cc, 7, 8);
		cct.printInSameComp(cc, 7, 9);
	}
	
	private void printGraphComponents(GraphAdjList g, ConnectedComponents cc) {
		System.out.println("Sub graphs count is: " + cc.getComponentCount()); 
		List<Integer> compDetails[] = new LinkedList[cc.getComponentCount()];
		for(int i=0; i<cc.getComponentCount(); i++) {
			compDetails[i] = new LinkedList<>();
		}
		int id;
		for(int s=0; s<g.getVertexCount(); s++) {
			id = cc.getCompId(s);
			compDetails[id].add(s);
		}
		for(int i=0; i<cc.getComponentCount(); i++) {
			for(int a: compDetails[i]) {
				System.out.print(a + " ");
			}
			System.out.println("");
		}
	}
	
	private void printInSameComp(ConnectedComponents cc, int v, int w) {
		if(cc.isPartOfSameComp(v, w)) {
			System.out.println(v + " and " + w + " are part of same sub graph");
		} else {
			System.out.println(v + " and " + w + " NOT part of same sub graph");
		}
	}

}
