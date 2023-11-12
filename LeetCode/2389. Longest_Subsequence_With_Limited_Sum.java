/* Link - https://leetcode.com/problems/longest-subsequence-with-limited-sum/ */

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        for(int i=0; i<queries.length; i++){
            int sum=0, ind=0, c=0;
            while(ind<nums.length){
                if(sum + nums[ind] <= queries[i]){
                    sum += nums[ind];
                    c++;
                }
                ind++;
            }
            ans[i] = c;
        }
        return ans;
    }
}
