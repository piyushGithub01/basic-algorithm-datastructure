package com.sorting.geeks;

public class BubbleSort {

	
	// Worst and Average Case Time Complexity: O(n*n). Worst case occurs when
	// array is reverse sorted.
	// Best Case Time Complexity: O(n). Best case occurs when array is already
	// sorted.
	// Auxiliary Space: O(1)
	// Boundary Cases: Bubble sort takes minimum time (Order of n) when elements
	// are already sorted.
	// Sorting In Place: Yes
	// Due to its simplicity, bubble sort is often used to introduce the concept
	// of a sorting algorithm.
	// In computer graphics it is popular for its capability to detect a very
	// small error (like swap of just two elements) in almost-sorted arrays and
	// fix it with just linear complexity (2n). 
	//
//	    void bubbleSort(int arr[])
//	    {
//	        int n = arr.length;
//	        for (int i = 0; i < n-1; i++)
//	            for (int j = 0; j < n-i-1; j++)
//	                if (arr[j] > arr[j+1])
//	                {
//	                    // swap temp and arr[i]
//	                    int temp = arr[j];
//	                    arr[j] = arr[j+1];
//	                    arr[j+1] = temp;
//	                }
//	    }
	 
	    /* Prints the array */
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    // Driver method to test above
	    public static void main(String args[])
	    {
	        BubbleSort ob = new BubbleSort();
	        int arr[] = {64, 34, 25, 12, 22, 11, 90};
	        System.out.print("Before sorting :  ");
	        ob.printArray(arr);
	        ob.bubbleSort(arr);
	        System.out.print("After sorting  :  ");
	        ob.printArray(arr);
	    }

		private void bubbleSort(int[] arr) {
			int temp;
			boolean swap = false;
			for(int i = 0; i < arr.length-1; i++){
				for(int j=0; j < arr.length-1-i; j++){
					if(arr[j] > arr[j+1]){
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swap = true;
					}
				}
				if (swap == false) {
					break;
				}
			}
		}
	    
}
