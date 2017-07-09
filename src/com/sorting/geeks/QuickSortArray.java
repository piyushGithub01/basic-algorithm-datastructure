package com.sorting.geeks;

public class QuickSortArray {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1,0};
		QuickSortArray q = new QuickSortArray(); 
		System.out.print("Before sorting : ");
		q.printArr(arr);
		q.quickSort(arr, 0, arr.length-1);
		System.out.print("After sorting  : ");
		q.printArr(arr);
	}

	private void quickSort(int[] arr, int start, int end) {
		if(start < end){
			int pi = sortAndReturnPivotPosition(arr, start, end);
			quickSort(arr, start, pi-1);
			quickSort(arr, pi+1, end);
			
		}
	}

	private int sortAndReturnPivotPosition(int[] arr, int start, int end) {
		int pivotValue = arr[end];
		int i = start-1;
		for(int j=start; j<=end-1; j++){
			if(arr[j]<=pivotValue){
				//swap
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i+1;
	}

	private void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
