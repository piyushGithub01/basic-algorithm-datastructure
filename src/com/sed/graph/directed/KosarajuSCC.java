package com.sed.graph.directed;

import java.util.Stack;

public class KosarajuSCC {
	
	private boolean[] visited;
	private int[] id;
	private int count;
	
	public KosarajuSCC(DiGraph dg){
		visited = new boolean[dg.getVertexCount()];
		id = new int[dg.getVertexCount()];
		DepthFirstOrder dfo = new DepthFirstOrder(dg.reverse());
		printOrder(dfo.getReversePostOrder());
		for(int s: dfo.getReversePostOrder()) {
			if(!visited[s]) {
				dfs(dg, s);
				count++;
			}
		}
	}
	
	private void dfs(DiGraph dg, int v) {
		visited[v] = true;
		id[v] = count;
		for(int w: dg.getAdjList(v)) {
			if(!visited[w]) {
				dfs(dg, w);
			}
		}
	}
	
	public int compCount() {
		return count;
	}
	
	public boolean isStronglyConnected(int v, int w) {
		return id[v] == id[w];
	}
	
	private void printOrder(Iterable<Integer> it) {
		for(int i: it) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private void printReversePost(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
		System.out.println();
	}
}
