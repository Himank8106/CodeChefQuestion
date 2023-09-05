/* Link - https://leetcode.com/problems/maximum-product-difference-between-two-pairs/ */

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int ans = (nums[size-1]*nums[size-2]) - (nums[0]*nums[1]);
        System.gc();
        return ans;
    }
}

/*
Arrays.sort(nums);
        return (nums[nums.length -1]*nums[nums.length -2])-(nums[0]*nums[1]);
*/
