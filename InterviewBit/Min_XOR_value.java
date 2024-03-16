/* Link - https://www.interviewbit.com/problems/min-xor-value/ */

public class Solution {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int minXor = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
        int currentXor = A[i] ^ A[i + 1];
        minXor = Math.min(minXor, currentXor);
        }

        return minXor;
    }
}
