package com.matrix.d2.geeks;

public class MinimumPathSumDP {

	public static void main(String[] args) {
		int[][] grida = {{1,5,0,2}};
		int[][] gridb = {{1},{5},{0},{2}};
		int[][] gridc = {{1,3},{2,1}};
		int[][] gridd = {{1,2,3},{4,5,6},{7,8,9}};
		MinimumPathSumDP mps = new MinimumPathSumDP();
		int minPatha = mps.minPathDP(grida);
		System.out.println("Excepted count is 8 and Actual count is " + minPatha);
		int minPathb = mps.minPathDP(gridb);
		System.out.println("Excepted count is 8 and Actual count is " + minPathb);
		int minPathc = mps.minPathDP(gridc);
		System.out.println("Excepted count is 4 and Actual count is " + minPathc);
		int minPathd = mps.minPathDP(gridd);
		System.out.println("Excepted count is 21 and Actual count is " + minPathd);
	}
	
	private int minPathDP(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] dp = new int[m][n];
		dp[0][0] = grid[0][0];
		
		for(int i=1; i<m; i++) {
			dp[i][0] = dp[i-1][0] + grid[i][0];
		}
		for(int j=1; j<n; j++) {
			dp[0][j] = dp[0][j-1] + grid[0][j];
		}
		for(int i=1; i<m; i++) {
			for(int j=1; j<n; j++) {
				if(dp[i-1][j] < dp[i][j-1]) {
					dp[i][j] = grid[i][j] + dp[i-1][j];
				} else {
					dp[i][j] = grid[i][j] + dp[i][j-1];
				}
			}
		}
		return dp[m-1][n-1];
	}

}
