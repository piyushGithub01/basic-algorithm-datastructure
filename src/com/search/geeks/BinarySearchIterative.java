package com.search.geeks;

public class BinarySearchIterative {

	public static void main(String[] args) {
		BinarySearchIterative bsi = new BinarySearchIterative();
		int arr[] = {0,1,2,3,4,5};
		int index = bsi.binarySearch(arr, 4);
		if(index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index " + index);
		}
	}
	
	private int binarySearch(int arr[], int x) {
		int l = 0;
		int r = arr.length - 1;
		int m;
		while(l <= r) {
			m = l + ((r-l)/2);
			if(arr[m] == x) {
				return m;
			}
			if(arr[m] < x) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return -1;
	}

}
