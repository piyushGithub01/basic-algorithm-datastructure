package com.matrix.d2.geeks;

public class UniquePathHurdleDfs {

	public static void main(String[] args) {
		int[][] grida = {{1,5,0,2}};
		int[][] gridb = {{1},{5},{0},{2}};
		int[][] gridc = {{1,3},{2,1}};
		int[][] gridd = {{1,2,3},{4,5,6},{7,8,9}};
		UniquePathHurdleDfs uphdfs = new UniquePathHurdleDfs();
		int hurdle = 2;
		int uniquePatha = uphdfs.uniquePathDP(grida, hurdle);
		System.out.println("Excepted count is 0 and Actual count is " + uniquePatha);
		int uniquePathb = uphdfs.uniquePathDP(gridb, hurdle);
		System.out.println("Excepted count is 0 and Actual count is " + uniquePathb);
		int uniquePathc = uphdfs.uniquePathDP(gridc, hurdle);
		System.out.println("Excepted count is 1 and Actual count is " + uniquePathc);
		int uniquePathd = uphdfs.uniquePathDP(gridd, hurdle);
		System.out.println("Excepted count is 3 and Actual count is " + uniquePathd);
	}
	
	private int uniquePathDP(int[][] grid, int hurdle) {
		return helper(0, 0, grid, hurdle);
	}
	
	private int helper(int i, int j, int[][] grid, int hurdle) {
		int m = grid.length;
		int n = grid[0].length;
		if(hurdle == grid[0][0] || hurdle == grid[m-1][n-1]) {
			return 0;
		}
		if(i==m-1 && j==n-1) {
			if(hurdle == grid[i][j]) {
				return 0;
			}
			return 1;
		}
		if(i<m-1 && j<n-1) {
			if(hurdle == grid[i][j]) {
				return 0;
			}
			return helper(i+1, j, grid, hurdle) + helper(i, j+1, grid, hurdle);
		}
		if(i<m-1) {
			if(hurdle == grid[i][j]) {
				return 0;
			}
			return helper(i+1, j, grid, hurdle);
		}
		if(j<n-1) {
			if(hurdle == grid[i][j]) {
				return 0;
			}
			return helper(i, j+1, grid, hurdle);
		}
		return 0;
	}

}
