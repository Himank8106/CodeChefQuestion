/* Link - https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/ */

class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int x: nums) max = Math.max(x, max);
        int i=0, count=0, maxc=1;
        while(i<nums.length){
            if(nums[i]==max){
                while(i<nums.length && nums[i++]==max) count++;
                maxc = Math.max(maxc,count);
                count = 0;
            } 
            else i++;
        }
        return maxc;
    }
}
