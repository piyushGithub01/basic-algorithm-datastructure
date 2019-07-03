package com.search.geeks;

public class JumpSearch {

	public static void main(String [ ] args) 
    { 
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
                    34, 55, 89, 144, 233, 377, 610}; 
        int x = 55; 
        // Find the index of 'x' using Jump Search 
        JumpSearch js = new JumpSearch();
        int index = js.jumpSearch(arr, x); 
        // Print the index where 'x' is located 
        System.out.println("\nNumber " + x + 
                            " is at index " + index); 
    }
	
	private int jumpSearch(int arr[], int x) {
		int size = arr.length;
		int prev = 0;
		int step = (int)Math.floor(Math.sqrt(size));
		//step figuration
		while(arr[(Math.min(step, size))] < x) {
			prev = step;
			if(prev >= size) {
				return -1;
			}
			step += (int)Math.floor(Math.sqrt(size));
		}
		//linear scan from prev
		while(arr[prev] < x) {
			prev++;
			//if prev oversteped size or step size 
			if(prev > Math.min(step, size)) {
				return -1;
			}
		}
		if(arr[prev] == x) {
			return prev;
		}
		return -1;
	}

}
