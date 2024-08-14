/* Link - https://leetcode.com/problems/find-k-th-smallest-pair-distance/ */

class Solution {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums[nums.length-1]-nums[0];
        while(left<right){
            int mid = (left+right)/2;
            if(isSmallPairs(nums, k, mid)) right = mid;
            else left = mid+1;
        }
        return left;
    }

    private boolean isSmallPairs(int[] nums, int k, int mid){
        int count = 0, left = 0;
        for(int right=1; right<nums.length; right++){
            while(nums[right]-nums[left]>mid) left++;
            count += right-left;
        }
        return count>=k;
    }
}
