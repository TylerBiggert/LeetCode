import java.util.Arrays;

/*
912. Sort an Array
Medium

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
 

Constraints:

1 <= nums.length <= 50000
-50000 <= nums[i] <= 50000

===============================

Learning Outcomes:

*/

class Solution912 {
    public int[] sortArray(int[] nums) {
		Arrays.sort(nums);
		return nums;
    }
}