/* Link - https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/ */

class Solution {
    private int maxi = 0;

    private void solve(int c, int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (c >= m) return;

        solve(c + 1, matrix);

        for (int i = 0; i < n; i++) {
            matrix[i][c] = 1 - matrix[i][c];
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != matrix[i][j - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) cnt++;
        }

        maxi = Math.max(maxi, cnt);
        solve(c + 1, matrix);
    }

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        solve(0, matrix);
        return maxi;
    }
}
