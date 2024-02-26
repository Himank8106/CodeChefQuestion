/* Link - https://www.interviewbit.com/problems/distribute-in-circle/ */

public class Solution {
    public int solve(int A, int B, int C) {
        return (A+C-1)%B;
    }
}
