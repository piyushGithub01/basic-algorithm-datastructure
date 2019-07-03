package com.matrix.d2.geeks;

public class SearchElement1 {
	
	public static void main(String[] args) {
		int[][] arr = {
				{0,1,2,3,4,5},{6,7,8,9,10,11},{12,13,14,15,16,17}
		};
		SearchElement1 se = new SearchElement1();
		int x = 15;
		boolean exists = se.checkElementExists(arr, x);
		if(exists) {
			System.out.println("Element " + x + " exists");
		} else {
			System.out.println("Element " + x + " does not exist");
		}
	}
	
	private boolean checkElementExists(int[][] arr, int x) {
		int m = arr.length;
		int n = arr[0].length;
		System.out.println("m " + m + " n " + n);
		int start = 0;
		int end = (m*n) -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			int midX = mid / n;
			int midY = mid % n;
			if(arr[midX][midY] == x) {
				System.out.println("midX " + midX + " midY " + midY);
				return true;
			}
			if(arr[midX][midY] < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

}
