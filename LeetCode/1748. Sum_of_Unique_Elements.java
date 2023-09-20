/* Link - https://leetcode.com/problems/sum-of-unique-elements/ */

class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int sum = 0;
        int val;
        int len = nums.length;
        for(int i = 0;i < len; i++){
            val = nums[i];
            if(count[val] == 0){
                sum += val;
            } else if(count[val] == 1){
                sum -= val;
            }
            count[val] += 1;
        }
        return sum;
    }
}

  
/* 
int sum=0, count;
        for(int i=0; i<nums.length; i++){
            count = 1;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                    break;
                }
            }
            if(count==1){
                sum += nums[i];
            }
        }
        return sum;
*/
