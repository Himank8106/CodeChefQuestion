/* Link - https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/ */

class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0, digisum=0;
        for(int i=0; i<nums.length; i++){
            elesum += nums[i];
            while(nums[i]!=0){
                digisum += nums[i]%10;
                nums[i] /= 10;
            }
        }
        return Math.abs(elesum-digisum);
    }
}
