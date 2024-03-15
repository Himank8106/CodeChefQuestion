/* Link - https://leetcode.com/problems/product-of-array-except-self/ */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        int prefixprod = 1;
        for(int i=0; i<nums.length; i++){
            prod[i] = prefixprod;
            prefixprod *= nums[i];
        }
        int suffixprod = 1;
        for(int i=nums.length-1; i>=0; i--){
            prod[i] *= suffixprod;
            suffixprod *= nums[i];
        }
        return prod;
    }
}
