/* Link - https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/ */

class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=0, prev=0;
        for(int i: nums)      //i is the current element
        {
            if(i<=prev) ans+=++prev-i;  //not increasing
            else prev=i;     //if current element > prev, then update prev to curr
        }
        return ans; 
    }
}

/* 
 int count = 0;
        for(int i=0; i<nums.length-1; i++){
            int diff = 0;
            if(nums[i+1]<=nums[i]){
                diff = nums[i]-nums[i+1]+1;
                count += diff;
                nums[i+1] += diff; 
            }
        }
        return count;
*/
