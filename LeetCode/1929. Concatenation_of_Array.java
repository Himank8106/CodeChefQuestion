/* Link - https://leetcode.com/problems/concatenation-of-array/ */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<2*n; i++){
            ans[i] = nums[i%n];
        }
        return ans;
    }
}

/*
for(int i=0; i<n; i++){
    ans[i] = nums[i];
}
for(int i=n; i<(2*n); i++){
    ans[i] = nums[i-n];
}
return ans;
*/ 
