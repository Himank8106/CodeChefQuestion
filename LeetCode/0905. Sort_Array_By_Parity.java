/* Link - https://leetcode.com/problems/sort-array-by-parity/ */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            if (nums[i]%2 > nums[j]%2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            if (nums[i]%2 == 0) i++;
            if (nums[j]%2 != 0) j--;
        }
        return nums;
    }
}

/* 
int[] ans = new int[nums.length];
        int k=0, l=nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                ans[k++]=nums[i];
            }
            else{
                ans[l--]=nums[i];
            }
        }
        return ans;
*/
