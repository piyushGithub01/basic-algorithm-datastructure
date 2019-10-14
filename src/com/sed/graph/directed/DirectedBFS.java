package com.sed.graph.directed;

import java.util.LinkedList;
import java.util.Stack;

public class DirectedBFS {
	
	private boolean[] visited;
	private int[] root;
	private int source;
	
	public DirectedBFS(DiGraph dg, int source) {
		visited = new boolean[dg.getVertexCount()];
		root = new int[dg.getVertexCount()];
		this.source = source;
		bfs(dg, source);
	}
	
	private void bfs(DiGraph dg, int v) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visited[v] = true;
		while(!queue.isEmpty()) {
			v = queue.poll();
			for(int w: dg.getAdjList(v)) {
				if(!visited[w]) {
					queue.offer(w);
					visited[w] = true;
					root[w] = v;
				}
			}
		}
	}
	
	public boolean hasPath(int v) {
		return visited[v];
	}
	
	public Stack<Integer> path(int v) {
		if(!visited[v]) {
			return new Stack<>();
		}
		Stack<Integer> path = new Stack<>();
		path.add(v);
		while(v != source) {
			v = root[v];
			path.add(v);
		}
		return path;
	}

}
