package com.matrix.d2.geeks;

public class UniquePathDfs {

	public static void main(String[] args) {
		int[][] grida = {{1,5,0,2}};
		int[][] gridb = {{1},{5},{0},{2}};
		int[][] gridc = {{1,3},{2,1}};
		int[][] gridd = {{1,2,3},{4,5,6},{7,8,9}};
		UniquePathDfs updp = new UniquePathDfs();
		int uniquePatha = updp.uniquePathDP(grida);
		System.out.println("Excepted count is 1 and Actual count is " + uniquePatha);
		int uniquePathb = updp.uniquePathDP(gridb);
		System.out.println("Excepted count is 1 and Actual count is " + uniquePathb);
		int uniquePathc = updp.uniquePathDP(gridc);
		System.out.println("Excepted count is 2 and Actual count is " + uniquePathc);
		int uniquePathd = updp.uniquePathDP(gridd);
		System.out.println("Excepted count is 6 and Actual count is " + uniquePathd);
	}
	
	private int uniquePathDP(int[][] grid) {
		return helper(0, 0, grid);
	}
	
	private int helper(int i, int j, int[][] grid) {
		if(i==grid.length-1 && j==grid[0].length-1) {
			return 1;
		}
		if(i<grid.length-1 && j<grid[0].length-1) {
			return helper(i+1, j, grid) + helper(i, j+1, grid);
		}
		if(i<grid.length-1) {
			return 1;
		}
		if(j<grid[0].length-1) {
			return 1;
		}
		return 0;
	}

}
