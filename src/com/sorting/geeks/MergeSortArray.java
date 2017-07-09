package com.sorting.geeks;

public class MergeSort {
	
//	Merge Sort	is a Divide and	Conquer algorithm.
//	It divides input array in two halves, calls itself for the two halves and then merges
//	the two	sorted halves.
//	The merge() function is used for merging two halves.
	
//	Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) 
//	as merge sort always divides the array in two halves and take linear time to merge two halves.
//	Auxiliary Space: O(n)
//	Algorithmic Paradigm: Divide and Conquer
//	Sorting In Place: No in a typical implementation

	public static void main(String[] args) {
		int arr[] = {4,3,2,1,0};
		MergeSort m = new MergeSort();
		System.out.print("Before sorting : ");
		m.printArr(arr);
		m.mergeSort(arr, 0, arr.length-1);
		System.out.print("After sorting  : ");
		m.printArr(arr);
	}

	private void mergeSort(int[] arr, int startIndex, int endIndex) {
		int midIndex = (startIndex + endIndex)/2;
		if(startIndex < endIndex){
			mergeSort(arr, startIndex, midIndex);
			mergeSort(arr, midIndex+1, endIndex);
			merge(arr, startIndex, midIndex, endIndex);
		}
	}

	private void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
		int LSize = midIndex - startIndex +1;
		int RSize = endIndex - midIndex;
		int[] Larr = new int[LSize];
		int[] Rarr = new int[RSize];
		for(int i=0; i<LSize; i++){
			Larr[i] = arr[startIndex+i];
		}
		for(int j=0; j<RSize; j++){
			Rarr[j] = arr[midIndex+1+j];
		}
		int i=0, j=0;
		int newIndex = startIndex;
		while(i<LSize && j<RSize){
			if(Larr[i]<=Rarr[j]){
				arr[newIndex] = Larr[i];
				i++;
				newIndex++;
			}else{
				arr[newIndex] = Rarr[j];
				j++;
				newIndex++;
			}
		}
		while(i<LSize){
			arr[newIndex] = Larr[i];
			i++;
			newIndex++;
		}
		while(j<RSize){
			arr[newIndex] = Rarr[j];
			j++;
			newIndex++;
		}
	}

	private void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

	
//	Merge Sort is useful for sorting linked lists in O(nLogn) time.In case of linked lists the 
//	case is different mainly due to difference in memory allocation of arrays and linked lists. 
//	Unlike arrays, linked list nodes may not be adjacent in memory. Unlike array, in linked list, 
//	we can insert items in the middle in O(1) extra space and O(1) time. 
//	Therefore merge operation of merge sort can be implemented without extra space for linked lists.
//	
//	In arrays, we can do random access as elements are continuous in memory. Let us say we have 
//	an integer (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly 
//	access the memory at (x + i*4). Unlike arrays, we can not do random access in linked list. 
//	Quick Sort requires a lot of this kind of access. In linked list to access i’th index, 
//	we have to travel each and every node from the head to i’th node as we don’t have 
//	continuous block of memory. Therefore, the overhead increases for quick sort. Merge sort 
//	accesses data sequentially and the need of random access is low.
	
}
