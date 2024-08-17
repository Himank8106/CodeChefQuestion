/* Link - https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1 */

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long prod = 1, pr=1, zero = 0;
        for(int i=0; i<nums.length; i++){
            prod *= nums[i];
            if(nums[i]!=0) pr *= nums[i];
            if(nums[i]==0) zero++;
        }
        long[] ans = new long[nums.length];
        if(zero>1){
            Arrays.fill(ans, 0);
            return ans;
        } 
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) ans[i] = pr;
            else ans[i] = prod/nums[i];
        }
        return ans;
    }
}
