import java.util.Collections;
import java.util.List;

/*
1460. Make Two Arrays Equal by Reversing Sub-arrays
Easy

Given two integer arrays of equal length target and arr.

In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.

Return True if you can make arr equal to target, or False otherwise.

 

Example 1:

Input: target = [1,2,3,4], arr = [2,4,1,3]
Output: true
Explanation: You can follow the next steps to convert arr to target:
1- Reverse sub-array [2,4,1], arr becomes [1,4,2,3]
2- Reverse sub-array [4,2], arr becomes [1,2,4,3]
3- Reverse sub-array [4,3], arr becomes [1,2,3,4]
There are multiple ways to convert arr to target, this is not the only way to do so.
Example 2:

Input: target = [7], arr = [7]
Output: true
Explanation: arr is equal to target without any reverses.
Example 3:

Input: target = [1,12], arr = [12,1]
Output: true
Example 4:

Input: target = [3,7,9], arr = [3,7,11]
Output: false
Explanation: arr doesn't have value 9 and it can never be converted to target.
Example 5:

Input: target = [1,1,1,1,1], arr = [1,1,1,1,1]
Output: true
 

Constraints:

target.length == arr.length
1 <= target.length <= 1000
1 <= target[i] <= 1000
1 <= arr[i] <= 1000

======================================

Learning Outcomes:
focus on the outcome needed
could have just used Arrays.sort() LOL!!! next time :P

*/

class Solution1460 {
	public static void main(final String args[]) {
		final int[] targetArr = { 1, 2, 3, 4 };
		final int[] arr = { 2, 4, 1, 3 };
		canBeEqual(targetArr, arr);
	}

	public static boolean canBeEqual(int[] target, int[] arr) {
		List<Integer> targetList = new ArrayList<Integer>();
		List<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < target.length; i++) {
			targetList.add(target[i]);
			arrList.add(arr[i]);
		}
		Collections.sort(targetList);
		Collections.sort(arrList);

		return targetList.equals(arrList);

	}
}