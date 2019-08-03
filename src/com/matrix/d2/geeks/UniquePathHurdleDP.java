package com.matrix.d2.geeks;

public class UniquePathHurdleDP {

	public static void main(String[] args) {
		int[][] grida = {{1,5,0,2}};
		int[][] gridb = {{1},{5},{0},{2}};
		int[][] gridc = {{1,3},{2,1}};
		int[][] gridd = {{1,2,3},{4,5,6},{7,8,9}};
		UniquePathHurdleDP uphdp = new UniquePathHurdleDP();
		int hurdle = 2;
		int uniquePatha = uphdp.uniquePathDP(grida, hurdle);
		System.out.println("Excepted count is 0 and Actual count is " + uniquePatha);
		int uniquePathb = uphdp.uniquePathDP(gridb, hurdle);
		System.out.println("Excepted count is 0 and Actual count is " + uniquePathb);
		int uniquePathc = uphdp.uniquePathDP(gridc, hurdle);
		System.out.println("Excepted count is 1 and Actual count is " + uniquePathc);
		int uniquePathd = uphdp.uniquePathDP(gridd, hurdle);
		System.out.println("Excepted count is 3 and Actual count is " + uniquePathd);
	}
	
	private int uniquePathDP(int[][] grid, int hurdle) {
		int m = grid.length;
		int n = grid[0].length;
		if(hurdle == grid[0][0] || hurdle == grid[m-1][n-1]) {
			return 0;
		}
		
		int[][] dp = new int[m][n];
		dp[0][0] = 1;
		for(int i=1; i<m; i++) {
			if(grid[i][0] == hurdle) {
				dp[i][0] = 0;
			} else {
				dp[i][0] = dp[i-1][0];
			}
		}
		for(int j=1; j<n; j++) {
			if(grid[0][j] == hurdle) {
				dp[0][j] = 0;
			} else {
				dp[0][j] = dp[0][j-1];
			}
		}
		for(int i=1; i<m; i++) {
			for(int j=1; j<n; j++) {
				if(grid[i][j] == hurdle) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
				}
			}
		}
		return dp[m-1][n-1];
	}

}
