/* Link - https://www.interviewbit.com/problems/pick-from-both-sides/ */

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        int ans = sum;
        int j = n - 1;
        for (int i = B - 1; i >= 0; i--) {
            sum = sum - A[i] + A[j--];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
