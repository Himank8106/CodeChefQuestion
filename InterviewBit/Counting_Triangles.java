/* Link - https://www.interviewbit.com/problems/counting-triangles/ */

import java.util.Arrays;

public class Solution {
    public int nTriang(int[] A) {
        int MOD = 1000000007;
        Arrays.sort(A);
        int n = A.length;
        int count = 0;

        for (int i = n - 1; i > 1; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (A[left] + A[right] > A[i]) {
                    count += right - left;
                    count %= MOD;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}
