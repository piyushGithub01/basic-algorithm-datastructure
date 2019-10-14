package com.sed.graph.directed;

import java.util.Stack;

public class DirectedCycle {
	
	private boolean[] visited;
	private boolean[] onStack;
	private int[] root;
	private Stack<Integer> cycle;
	
	public DirectedCycle(DiGraph dg) {
		visited = new boolean[dg.getVertexCount()];
		onStack = new boolean[dg.getVertexCount()];
		root = new int[dg.getVertexCount()];
		for(int v=0; v<dg.getVertexCount(); v++) {
			if(!visited[v]) {
				dfs(dg, v);
			}
		}
	}
	
	private void dfs(DiGraph dg, int v) {
		visited[v] = true;
		onStack[v] = true;
		for(int w: dg.getAdjList(v)) {
			if(hasCycle()) {
				return;
			} else if(!visited[w]) {
				root[w] = v;
				dfs(dg, w);
			} else if(onStack[w]) {
				cycle = new Stack<>();
				cycle.add(v);
				while(w != v) {
					v = root[v];
					cycle.add(v);
				}
			}
		}
		onStack[v] = false;
	}
	
	public boolean hasCycle() {
		return cycle != null;
	}
	
	public Stack<Integer> cycle() {
		return cycle;
	}

}