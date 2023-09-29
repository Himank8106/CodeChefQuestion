/* Link - https://leetcode.com/problems/monotonic-array/ */

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums[0] < nums[nums.length-1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i-1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i-1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

/* 
boolean inc=true,dec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) inc=false;
            if(nums[i]<nums[i+1]) dec=false;
        }
        System.gc();
        return inc || dec;
*/

/* 
int count = 0, count1=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] <= nums[i+1]){
                count++;
            }
        }
        if(count==nums.length-1){
            return true;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                count1++;
            }
        }
        if(count1==nums.length-1){
            return true;
        }
        return false;
*/
