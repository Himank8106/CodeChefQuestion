/* Link - https://leetcode.com/problems/running-sum-of-1d-array/ */

class Solution {
    public int[] runningSum(int[] nums) {
        int size=nums.length;
            int rs[] = new int[size];
                rs[0]=rs[0]+nums[0];
            for(int i=1;i<size;i++){
                for(int j=0;j<i;j++){
                    rs[i]=rs[j]+nums[i];
                }

            }
            return rs;
    }
}


/* 
int sum = 0;
for(int i=0; i<nums.length; i++){
    sum += nums[i];
    nums [i] = sum;
}
return nums;
*/
