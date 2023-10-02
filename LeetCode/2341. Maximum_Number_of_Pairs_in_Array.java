/* Link - https://leetcode.com/problems/maximum-number-of-pairs-in-array/ */

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[101];
        int y = 0;
        for(int num : nums){
            ++arr[num];
        }
        for(int num: arr){
            y += num/2;
        }
        return  new int[] {y, nums.length-2*y};
    }
}
