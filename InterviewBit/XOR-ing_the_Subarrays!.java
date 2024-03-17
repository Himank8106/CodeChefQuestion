/* Link - https://www.interviewbit.com/problems/xor-ing-the-subarrays/ */

public class Solution {
    public int solve(int[] A) {
        int ans = A[0];
        if(A.length%2==0){
            return 0;
        }
        else{
            for(int i=2; i<A.length; i++){
                ans ^= A[i];
                i++;
            }
        }
        return ans;
    }
}
