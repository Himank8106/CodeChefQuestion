/* Link - https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/ */

class Solution {
    public int countPairs(int[] nums, int k) {
        int c = 0;
        int n = nums.length;
        int i = 0;
        for(int v : nums){
            for(int j=i+1; j<n; j++){
                if(v==nums[j] && (i*j)%k==0) c++;
            }
            i++;
        }
        return c;
    }
}

/* 
int n=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && (i*j)%k==0) n+=1;
            }
        }
        return n;
*/
