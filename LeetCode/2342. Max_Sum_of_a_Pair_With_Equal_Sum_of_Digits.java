/* Link - https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/ */

class Solution {
    public int maximumSum(int[] nums) {
        int[] arr = new int[82];
        Arrays.fill(arr,-1);
        int ans = -1;
        for(int x: nums){
            int sum=0, temp=x;
            while(temp>0){
                sum += (temp%10);
                temp /= 10;
            }
            if(arr[sum]!=-1){
                ans = Math.max(ans, x+arr[sum]);
            }
            arr[sum] = Math.max(x, arr[sum]);
        }
        return ans;
    }
}
