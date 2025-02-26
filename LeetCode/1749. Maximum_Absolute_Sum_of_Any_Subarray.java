/* Link - https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/ */

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0, minSum = 0, maxSum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) maxSum = sum;
            if (sum < minSum) minSum = sum;
        }
        return Math.abs(maxSum - minSum);
    }
}
