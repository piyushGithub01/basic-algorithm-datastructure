package com.matrix.d2.geeks;

public class MaxPathFinder {

	    // `M × N` matrix
	    private static final int M = 10;
	    private static final int N = 10;
	 
	    // Check if it is possible to go to position `(x, y)` from
	    // the current position. The function returns false if the cell
	    // has a value 0, or it is already visited.
	    private static boolean isSafe(int mat[][], int visited[][], int x, int y)
	    {
	        if (mat[x][y] == 0 || visited[x][y] != 0) {
	            return false;
	        }
	 
	        return true;
	    }
	 
	    // Returns false if not a valid position
	    private static boolean isValid(int x, int y)
	    {
	        if (x < M && y < N && x >= 0 && y >= 0) {
	            return true;
	        }
	 
	        return false;
	    }
	 
	    // Find the longest possible route in a matrix `mat` from the source cell
	    // `(0, 0)` to destination cell `(x, y)`.
	    // `max_dist` —> keep track of the length of the longest path from source to
	    // destination.
	    // `dist` —> length of the path from the source cell to the current cell `(i, j)`.
	    public static int findLongestPath(int mat[][], int visited[][], int i,
	                                int j, int x, int y, int max_dist, int dist)
	    {
	    	System.out.println("on path i, j " + i + " " + j);
	        // if the destination is not possible from the current cell
	        if (mat[i][j] == 0) {
	        	System.out.println(" path is blocked due to 0");
	            return 0;
	        }
	 
	        // if the destination is found, update `max_dist`
	        if (i == x && j == y) {
	        	System.out.println("reached i, j, max " + i + " " + j + " " + Integer.max(dist, max_dist));
	            return Integer.max(dist, max_dist);
	        }
	 
	        // set `(i, j)` cell as visited
	        visited[i][j] = 1;
	 
	        // go to the bottom cell
	        if (isValid(i + 1, j) && isSafe(mat, visited, i + 1, j))
	        {
	            max_dist = findLongestPath(mat, visited, i + 1, j, x, y,
	                                        max_dist, dist + 1);
	        }
	 
	        // go to the right cell
	        if (isValid(i, j + 1) && isSafe(mat, visited, i, j + 1))
	        {
	            max_dist = findLongestPath(mat, visited, i, j + 1, x, y,
	                                        max_dist, dist + 1);
	        }
	 
	        // go to the top cell
	        if (isValid(i - 1, j) && isSafe(mat, visited, i - 1, j))
	        {
	            max_dist = findLongestPath(mat, visited, i - 1, j, x, y,
	                                        max_dist, dist + 1);
	        }
	 
	        // go to the left cell
	        if (isValid(i, j - 1) && isSafe(mat, visited, i, j - 1))
	        {
	            max_dist = findLongestPath(mat, visited, i, j - 1, x, y,
	                                        max_dist, dist + 1);
	        }
	 
	        // backtrack: remove `(i, j)` from the visited matrix
	        System.out.println("resetting i, j to zero non visited " + i + " " + j + " ");
	        visited[i][j] = 0;
	 
	        return max_dist;
	    }
	 
	    public static void main(String[] args)
	    {
	        // input matrix
	        int mat[][] =
	        {
	                { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
	                { 1, 1, 0, 0, 1, 1, 1, 0, 1, 1 },
	                { 1, 1, 0, 0, 1, 1, 0, 1, 0, 1 },
	                { 0, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
	                { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
	                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
	                { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
	                { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
	                { 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
	                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }
	        };
	 
	        // construct a matrix to keep track of visited cells
	        int[][] visited= new int[N][N];
	 
	        // `(0, 0)` are the source cell, and `(5, 7)` are the destination
	        // cell coordinates
	        int max_dist = findLongestPath(mat, visited, 0, 0, 2, 0, 0, 0);
	 
	        System.out.println("The maximum length path is " + max_dist);
	    }
	}
