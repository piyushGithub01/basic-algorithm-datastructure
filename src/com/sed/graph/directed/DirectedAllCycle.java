package com.sed.graph.directed;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DirectedAllCycle {
	
	private boolean[] visited;
	private boolean[] onStack;
	private int[] root;
	private Stack<Integer> cycle;
	private List<Stack<Integer>> allCycle = new ArrayList<Stack<Integer>>();
	
	public DirectedAllCycle(DiGraph dg) {
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
			if(!visited[w]) {
				root[w] = v;
				dfs(dg, w);
			} else if(onStack[w]) {
				cycle = new Stack<>();
				int r = v;
				cycle.add(r);
				while(w != r) {
					r = root[r];
					cycle.add(r);
				}
				allCycle.add(cycle);
			}
		}
		onStack[v] = false;
		visited[v] = false;
	}
	
	public boolean hasCycle() {
		return cycle != null;
	}
	
	public List<Stack<Integer>> allCycle() {
		return allCycle;
	}

}