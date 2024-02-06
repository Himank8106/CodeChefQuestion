/* Link - https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/ */

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        return A[0]+A[A.length-1];
    }
}
