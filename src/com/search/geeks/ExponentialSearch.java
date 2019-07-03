package com.search.geeks;

import java.util.Arrays;

public class ExponentialSearch {
	public static void main(String args[]) 
    { 
        int arr[] = {2, 3, 4, 10, 40}; 
        int x = 10; 
        ExponentialSearch es = new ExponentialSearch();
        int result = es.exponentialSearch(arr, x); 
          
        System.out.println((result < 0) ?  
                            "Element is not present in array" : 
                            "Element is present at index " +  
                             result); 
    } 
	
	private int exponentialSearch(int[] arr, int x) {
		int size = arr.length;
		int i = 0;
		if(arr[i] == x) {
			return i;
		}
		i = 1;
		//figuration of i range
		while(i < size && arr[i] <= x) {
			i = i*2;
		}
		return Arrays.binarySearch(arr, i/2, Math.min(i, size), x);
	}
	
}
