/* Link - https://leetcode.com/problems/neither-minimum-nor-maximum/ */

class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2)
            return -1;
        else
           return Math.max(Math.min(Math.max(nums[0], nums[1]), nums[2]), Math.min(nums[0], nums[1]));
    }
}

 
/*
int count = 0;
        if(nums.length<3){
            return -1;
        }
        Arrays.sort(nums);   
        return nums[1];
*/
