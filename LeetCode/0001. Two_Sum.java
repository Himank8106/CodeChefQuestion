/* Link - https://leetcode.com/problems/two-sum/ */

class Solution {
    public int[] twoSum(int[] nums, int target) {       
        int c = 1;
        while(true){
            for(int i = 0; i < nums.length-c; i++){
                if(nums[i] + nums[i+c] == target){
                    return new int[]{i, i+c};
                }
            }
        c++;
        }
    }
}


/*
int[] ans = new int[2];
for(int i=0; i<nums.length; i++){
    for(int j=i+1; j<nums.length; j++){
        if(nums[i]+nums[j]==target){
            ans[0]=i;
            ans[1]=j;
        }
    }
} 
return ans;
*/
