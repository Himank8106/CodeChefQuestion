/* Link - https://www.interviewbit.com/problems/sort-array-with-squares/ */

public class Solution {
    public int[] solve(int[] A) {
        int[] ans = new int[A.length];
        for(int i=0; i<A.length; i++){
            ans[i] = A[i]*A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
