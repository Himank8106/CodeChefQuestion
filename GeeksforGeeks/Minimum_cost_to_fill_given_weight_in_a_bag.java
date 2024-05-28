/* Link - https://www.geeksforgeeks.org/problems/minimum-cost-to-fill-given-weight-in-a-bag1956/1 */

class Solution {
    public static int minimumCost(int n, int w, int[] cost) {
        // code here
        int[] dp = new int[w+1];
        dp[0] = 0;
        for(int i=1; i<=w; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=1; i<=w; i++){
            for(int j=1; j<=n; j++){
                if(j<=i && cost[j-1]!=-1 && dp[i-j]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-j]+cost[j-1]);
                }
            }
        }
        return dp[w]==Integer.MAX_VALUE?-1:dp[w];
    }
}
