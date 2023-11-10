/* Link - https://leetcode.com/problems/squares-of-a-sorted-array/ */ 

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right= nums.length-1;
        int[] sqr = new int[nums.length];
        int n=right;

        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                sqr[n]=nums[left]*nums[left];
                n--;
                left++;
            }
            else{
                sqr[n] = nums[right]*nums[right];
                n--;
                right--;
            }
        }
        return sqr;
    }
}



/* 
for(int i = 0;i<nums.length;i++)
        {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
*/
