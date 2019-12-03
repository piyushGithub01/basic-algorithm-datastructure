package com.sed.graph.directed;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstOrder {
	
	private boolean[] visited;
	private LinkedList<Integer> pre;
	private LinkedList<Integer> post;
	private Stack<Integer> reversePost;
	
	public DepthFirstOrder(DiGraph dg) {
		this.visited = new boolean[dg.getVertexCount()];
		this.pre = new LinkedList<>();
		this.post = new LinkedList<>();
		this.reversePost = new Stack<>();
		for(int v=0; v<dg.getVertexCount(); v++) {
			if(!visited[v]) {
				dfs(dg, v);
			}
		}
	}
	
	public LinkedList<Integer> getPreOrder() {
		return this.pre;
	}
	
	public LinkedList<Integer> getPostOrder() {
		return this.post;
	}
	
	public Iterable<Integer> getReversePostOrder() {
		return this.reversePost;
	}
	
	private void dfs(DiGraph dg, int v) {
		pre.add(v);
		visited[v] = true;
		for(int w : dg.getAdjList(v)) {
			if(!visited[w]) {
				dfs(dg, w);
			}
		}
		post.add(v);
		reversePost.push(v);
	}

}
