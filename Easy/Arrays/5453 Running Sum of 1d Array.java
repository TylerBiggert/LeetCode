package Easy.Arrays;

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.


// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

// Constraints:
// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6


// ===================================================

// Concepts Learned
// Did not have to make a new variable
// Could have started at index 1 and looked at previous value



class Solution5453 {

    public static void main(String args[]) {
        int[] numbers;
        numbers = new int[] { 1, 1, 1, 1, 1};
        runningSum(numbers);
    }

    public static int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            answer[i] = runningSum;
        }

        return answer;

    }
}