package com.array.geeks;

public class MergeSortedArray {
	
	//merge two sorted array
	//arr1 with size m+n - 2 NA 7 NA NA 10 NA
	//arr2 with size n - 5 8 12 14
	
	//move all elements of bigger array to end or start and then use index manipulation and fill in bigger array
	public static void main(String[] args) {
		int[] bigarr = {2, -1, 7, -1, -1, 10, -1};
		int[] smallarr = {5, 8, 12, 14};
		MergeSortedArray msa = new MergeSortedArray();
		msa.printarr(bigarr);
		msa.moveToEnd(bigarr);
		msa.printarr(bigarr);
		msa.merge(bigarr, smallarr);
		msa.printarr(bigarr);
		int[] bigarr2 = {111, -1, 112, -1, -1, 113, -1};
		int[] smallarr2 = {5, 8, 12, 14};
		msa.printarr(bigarr2);
		msa.moveToEnd(bigarr2);
		msa.printarr(bigarr2);
		msa.merge(bigarr2, smallarr2);
		msa.printarr(bigarr2);
	}
	
	private void merge(int[] bigarr, int[] smallarr) {
		int curr = 0, bstart = 0, sstart = 0;
		int bend = bigarr.length-1;
		int send = smallarr.length-1;
		for(int i : bigarr) {
			if(i == -1) {
				bstart++;
			} else {
				break;
			}
		}
		while(bstart <= bend && sstart <= send ) {
			if(bigarr[bstart] < smallarr[sstart]) {
				bigarr[curr] = bigarr[bstart];
				bstart++;
			} else {
				bigarr[curr] = smallarr[sstart];
				sstart++;
			}
			curr++;
		}
		while(bstart<=bend) {
			bigarr[curr] = bigarr[bstart];
			bstart++;
			curr++;
		}
		while(sstart<=send) {
			bigarr[curr] = smallarr[sstart];
			sstart++;
			curr++;
		}
	}
	
	private void moveToEnd(int[] arr) {
		int end = arr.length - 1;
		int curr = arr.length - 1;
		while(curr >= 0) {
			if(arr[curr] != -1) {
				arr[end] = arr[curr];
				end --;
				arr[curr] = -1;
			}
			curr--;
		}
	}
	
	private void printarr(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
