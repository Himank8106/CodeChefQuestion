/* Link - https://www.interviewbit.com/problems/maximum-sum-square-submatrix/ */

int Solution::solve(vector<vector<int>>& A, int B) 
{
    int n = A.size();
    int m = A[0].size();
    // Create a prefix sum matrix
    vector<vector<int>> prefixSum(n + 1, vector<int>(m + 1, 0));
    for(int i = 1; i <= n; i++) 
    {
        for(int j = 1; j <= m; j++) 
        {
            prefixSum[i][j] = A[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
        }
    }
    int maxi = INT_MIN;
    for(int i = 0; i <= n - B; i++) 
    {
        for(int j = 0; j <= m - B; j++) 
        {
            int sum = prefixSum[i + B][j + B] - prefixSum[i][j + B] - prefixSum[i + B][j] + prefixSum[i][j];
            maxi = max(maxi, sum);
        }
    }
    return maxi;
}
