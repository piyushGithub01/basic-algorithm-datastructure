package com.matrix.d2.geeks;

public class UniquePathDP {

	public static void main(String[] args) {
		int[][] grida = {{1,5,0,2}};
		int[][] gridb = {{1},{5},{0},{2}};
		int[][] gridc = {{1,3},{2,1}};
		int[][] gridd = {{1,2,3},{4,5,6},{7,8,9}};
		UniquePathDP updp = new UniquePathDP();
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
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] dp = new int[m][n];
		for(int i=0; i<m; i++) {
			dp[i][0] = 1;
		}
		for(int j=0; j<n; j++) {
			dp[0][j] = 1;
		}
		for(int i=1; i<m; i++) {
			for(int j=1; j<n; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
	}

}
