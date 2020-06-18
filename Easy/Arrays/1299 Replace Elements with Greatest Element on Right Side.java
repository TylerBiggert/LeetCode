/*
1299. Replace Elements with Greatest Element on Right Side
Easy

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 

Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5

======================

Learning Outcomes:

*/


class Solution1299 {
	public static void main(final String args[]) {
		final int[] numbers = { 17, 18, 5, 4, 6, 1 };
		replaceElements(numbers);
	}

	public static int[] replaceElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = 0;
			if (i == arr.length - 1) {
				arr[i] = -1;
				return arr;
			}
			for (int j = i+1; j < arr.length; j++) {
				if (j == arr.length - 1) {
					arr[i] = arr[j] > max ? arr[j] : max;
				} else {
					max = arr[j] > max ? arr[j] : max;
				}
			}
		}
		return arr;
	}
}