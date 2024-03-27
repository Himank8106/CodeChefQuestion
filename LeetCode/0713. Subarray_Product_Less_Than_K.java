/* Link - https://leetcode.com/problems/subarray-product-less-than-k/ */

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum = 1;
        int result = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            sum *= nums[right];
            while(sum >= k && left <= right) {
                sum /= nums[left];
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }
}

/* 
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<k){
                count++;
                int x = nums[i];
                for(int j=i+1; j<nums.length; j++){
                    if((x*nums[j])<k) count++;
                    else break;
                    x *= nums[j];
                }
            } 
            else continue;
        }
        return count;
    }
}
*/
