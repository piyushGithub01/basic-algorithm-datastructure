package com.unionfind.ce.algo1.week1;

/**
 * M union-find operations on a set of N objects
 * 
 * worst case: N + M*LogN
 * 
 * cost model : initialize = N ; union = LogN - cost of finding roots ; find = N - worst case
 * Trees can get tall. Find too expensive (could be N array accesses).
 * Quadratic algorithms don't scale with technology
 *
 */
public class QuickUnionPathCompressionUF {
	
	private int[] id;
	
	/**
	 * constructor to initialize id array (N array accesses)
	 * @param N - number of objects
	 */
	public QuickUnionPathCompressionUF(int N) {
		id = new int[N];
		for (int i=0; i<N; i++) {
			id[i] = i;
		}
	}
	
	/**
	 * finds parent most root of object 
	 * @param i object
	 * @return parent most root of object
	 * example 6 -> 5 -> 4 -> 3 then result returned is 3
	 */
	public int root(int i) {
		while ( i != id[i] ) {
			// extra line below 
			id[i] = id[id[i]];
			//
			i = id[i];
		}
		return i;
	}
	
	/**
	 * whether two objects are connected
	 * @param p object1
	 * @param q object2
	 * @return check if p and q have same root (depth of p and q array accesses)
	 */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	/**
	 * connects root of two objects 
	 * @param p
	 * @param q
	 * 
	 * change root of p to point to root of q (depth of p and q array accesses)
	 */
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

}
