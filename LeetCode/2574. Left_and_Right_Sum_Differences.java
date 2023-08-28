/* Link - https://leetcode.com/problems/left-and-right-sum-differences/ */

class Solution {
    int rightsum=0;
    public int[] leftRightDifference(int[] nums) {
        difference(nums,0,0);
        return nums;
    }
    public void difference(int[] nums, int i, int leftsum){
        if(i==nums.length)
        return;
        int n=nums[i];
        difference(nums,i+1,leftsum+n);
        nums[i]=leftsum>rightsum?leftsum-rightsum:rightsum-leftsum;
        rightsum+=n;
    }
}


/* 
        int rs =0;
        int ls =0;
        int [] answer = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            rs+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            rs-=nums[i];
            answer[i] = Math.abs(rs-ls);
            ls+=nums[i];
        }
        return answer ;
*/

/* 
        int n = nums.length;
        int[] leftsum = new int[nums.length];
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                leftsum[i] += nums[j];
            }
        }
        int[] rightsum = new int[nums.length];
        for(int i=0; i<n; i++){
            for(int j=nums.length-1; j>i; j--){
                rightsum[i] += nums[j];
            }
        }
        int[] answer = new int[nums.length];
        for(int i=0; i<n; i++){
            answer[i] = Math.abs(leftsum[i]-rightsum[i]); 
        }
        return answer;
*/

/*
        int[] arr = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            leftSum = 0;
            rightSum = 0;
            for(int k = nums.length - 1; k > i; k--){
                rightSum += nums[k];
            }
            for(int k = 0; k < i; k++){
                leftSum += nums[k];
            }
            arr[i] = Math.abs(leftSum - rightSum);
        }
        System.gc();
        return arr;
*/
