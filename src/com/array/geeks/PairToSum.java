package com.array.geeks;

import java.util.Arrays;

public class PairToSum {
	
	//find a pair with given sum in array
	//solution 1 : nested for lopps like bubble sort with O(n suqare)
	//solution 2 : hashing, add all elements to hastable and query O(n)
	//solution 3 : sorted array traversal from both end O(n log n)

	public static void main(String[] args) {
		int[] givenarr = {3,2,1,0,9,8,7,6,5,4};
		PairToSum ps = new PairToSum();
		System.out.println();
		ps.findPair(givenarr, 10);
		int[] givenarr2 = {3,2,1,0,9,8,7,6,5,5,5,4};
		System.out.println();
		ps.findPair(givenarr2, 10);
	}
	
	private void findPair(int[] givenarr, int sum) {
		Arrays.sort(givenarr);
		int start = 0;
		int end = givenarr.length - 1;
		int checksum = -1;
		
		while(start < end) {
			checksum = givenarr[start] + givenarr[end];
			if(checksum == sum) {
				System.out.println("sum found with pair " + givenarr[start] + " and " + givenarr[end]);
				start++;
			} else if(checksum > sum) {
				end--;
			} else {
				start++;
			}
		}
	}

}
