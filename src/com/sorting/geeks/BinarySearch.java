package com.sorting.geeks;

public class BinarySearch {
	
//		The time complexity of Binary Search can be written as
//		T(n) = T(n/2) + c 
//		O(LogN)
//		Auxiliary Space: O(1) in case of iterative implementation. 
//		In case of recursive implementation, O(Logn) recursion call stack space.

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int index = binarySearch(arr, 0, arr.length-1, 1);
		System.out.println("searching 2 in arr, index found is "+index);
	}

	private static int binarySearch(int[] arr, int startIndex, int endIndex, int search) {
		if(arr[endIndex]<search){
			return -1;
		}
		int mid = startIndex + ((endIndex-startIndex)/2);
		if(arr[mid]==search){
			return mid;
		}
		if(arr[mid]<search){
			return binarySearch(arr, mid+1, endIndex, search);
		}else{
			return binarySearch(arr, startIndex, mid-1, search);
		}
	}


}
