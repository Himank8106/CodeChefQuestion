/* Link - https://leetcode.com/problems/binary-subarrays-with-sum/ */

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0, count = 0, res = 0;
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] == 1) {
                goal--;
                count = 0;
            }
            
            while (goal == 0 && i <= j) {
                goal += nums[i];
                i++;
                count++;
                if (i > j - goal + 1)
                    break;
            }
            
            while (goal < 0) {
                goal += nums[i];
                i++;
            }
            
            res += count;
        }
        return res;
    }
}

/*
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum==goal) count++;
            }
        }
        return count;
    }
}
*/

