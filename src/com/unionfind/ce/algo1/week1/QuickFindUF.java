package com.unionfind.ce.algo1.week1;

/**
 * M union-find operations on a set of N objects
 * 
 * worst case:  M*N
 * 
 * 
 * cost model : initialize = N ; union = N ; find = 1
 * Union is too expensive. It takes N2 square array accesses to process a sequence of N union commands on N objects.
 * Quadratic algorithms don't scale with technology
 *
 */
public class QuickFindUF {
	
	private int[] id;
	
	/**
	 * constructor to initialize id array (N array accesses)
	 * @param N - number of objects
	 */
	public QuickFindUF(int N) {
		id = new int[N];
		for (int i=0; i<N; i++) {
			id[i] = i;
		}
	}
	
	/**
	 * whether two objects are connected
	 * @param p object1
	 * @param q object2
	 * @return true if id of both are same (2 array accesses)
	 */
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	/**
	 * connects id of two objects 
	 * @param p
	 * @param q
	 * 
	 * check each object root, change having id P to new id Q (at most 2N + 2 array accesses)
	 */
	public void union(int p, int q) {
		if (id[p] == id[q]) return;
		int rootP = id[p];
		int rootQ = id[q];
		for (int i=0; i<id.length; i++) {
			if (id[i] == rootP)
				id[i] = rootQ;
		}
	}

}
