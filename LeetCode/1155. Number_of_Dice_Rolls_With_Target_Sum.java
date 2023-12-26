/* Link - https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/ */

class Solution {
    int[][] dp;
    int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        if (n == 0 && target == 0) 
            return 1;
        if (target < n || n * k < target) 
            return 0;
        dp = new int[n + 1][target + 1];
        return f(n, k, target);
    }
    public int f(int n, int k, int target) {
        if (n == 0 && target == 0){
            return 1;
        }
        if (target < n || n * k < target) {
            return 0;
        }
        if (dp[n][target] != 0) {
            return dp[n][target];
        }
        int res = 0;
        for (int i = 1; i <= k; i++) {
            if (target < i) break;
                res = (res + f(n - 1, k, target - i) % MOD) % MOD;
        }
        dp[n][target] = res;
        return res;
    }
}

/* 
 var dp = new int[n][target];
        for (var i=0; i < Math.min(k, target); i++)
        dp[n-1][i] = 1;
        for (var i = n-2; i >=0; i--)
        for (var j=0; j < target; j++)
            for (var x=0; x < Math.min(k, j); x++)
            dp[i][j] = (dp[i][j] + dp[i+1][j-x-1]) % 1000000007;
        return dp[0][target-1];
*/
