package com.sed.graph.edgeweightedgraph;

public class Edge implements Comparable<Edge>{
	
	private final int v;
	private final int w;
	private final double weight;
	
	public Edge(int v, int w, double weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getEither() {
		return v;
	}
	
	public int getOther(int vertex) {
		if(vertex == v) {
			return w;
		} else if(vertex == w) {
			return v;
		} else {
			throw new RuntimeException("Inconsitence edge");
		}
	}
	
	@Override
	public int compareTo(Edge that) {
		if(this.weight > that.weight) {
			return 1;
		} else if(this.weight < that.weight) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Edge [v=" + v + ", w=" + w + ", weight=" + weight + "]";
	}

}
