package com.matrix.d2.geeks;

public class MinimumPathSumDfs {

	public static void main(String[] args) {
		int[][] grida = {{1,5,0,2}};
		int[][] gridb = {{1},{5},{0},{2}};
		int[][] gridc = {{1,3},{2,1}};
		int[][] gridd = {{1,2,3},{4,5,6},{7,8,9}};
		MinimumPathSumDfs mps = new MinimumPathSumDfs();
		int minPatha = mps.minPathDfs(grida);
		System.out.println("Excepted count is 8 and Actual count is " + minPatha);
		int minPathb = mps.minPathDfs(gridb);
		System.out.println("Excepted count is 8 and Actual count is " + minPathb);
		int minPathc = mps.minPathDfs(gridc);
		System.out.println("Excepted count is 4 and Actual count is " + minPathc);
		int minPathd = mps.minPathDfs(gridd);
		System.out.println("Excepted count is 21 and Actual count is " + minPathd);
	}
	
	private int minPathDfs(int[][] grid) {
		return helper(0, 0, grid);
	}
	
	private int helper(int i, int j, int[][] grid) {
		if(i==grid.length-1 && j==grid[0].length-1) {
			return grid[i][j];
		}
		if(i<grid.length-1 && j<grid[0].length-1) {
			int s1 = grid[i][j] + helper(i+1, j, grid);
			int s2 = grid[i][j] + helper(i, j+1, grid);
			return Math.min(s1, s2);
		}
		if(i<grid.length-1) {
			return grid[i][j] + helper(i+1, j, grid);
		}
		if(j<grid[0].length-1) {
			return grid[i][j] + helper(i, j+1, grid);
		}
		
		return 0;
	}

}
