package com.unionfind.ce.algo1.week1;

/**
 * M union-find operations on a set of N objects
 * 
 * worst case: N + M*LogN
 * 
 * cost model : initialize = N ; union = logBase2N -> includes cost of finding roots ; find = N -> worst case
 * Find: takes time proportional to depth of p and q.
 * Union: takes constant time, given roots
 * Depth of any node x is at most lg N.	lg = base-2 logarithm
 * Quadratic algorithms don't scale with technology
 *
 */
public class QuickUnionWeightedUF {
	
	private int[] id;
	private int[] sz;
	
	/**
	 * constructor to initialize id array (N array accesses) and size array to 1
	 * @param N - number of objects
	 */
	public QuickUnionWeightedUF(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i=0; i<N; i++) {
			id[i] = i;
			sz[i] = 1;
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
	 * update root of smaller tree to root of larger tree. (depth of p and q array accesses)
	 * increase size of larger tree by adding size of smaller
	 */
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
//		id[i] = j;  instead of this do below improvement
		if (sz[i] < sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		} else {
			id[j] = i;
			sz[i] += sz[j];
		}
	}

}
