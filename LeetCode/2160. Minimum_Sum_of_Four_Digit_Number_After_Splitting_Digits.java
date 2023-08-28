/* Link - https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/ */

class Solution {
    public int minimumSum(int num) {
        int[] ans = new int[4];
        for(int i=0; i<4; i++){
            ans[i]=num%10;
            num /= 10;
        }
        Arrays.sort(ans);
        return ((ans[0]*10+ans[2])+(ans[1]*10+ans[3]));
    }
}
