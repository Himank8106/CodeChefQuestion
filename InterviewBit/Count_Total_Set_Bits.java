/* Link - https://www.interviewbit.com/problems/count-total-set-bits/ */

public class Solution {
    public int solve(int A) {
        long mod = 1000000007;
        long r = 0;
        long p = 1;
        long q = 1;
        int k = 0;
        if(A%2 == 1) {
            r++;
            k++;
        }
        A = A/2;
        while(A > 0){
            if(A%2 == 1){
                r = (r+p*q +k +1)%mod;
                k += 2*p;
            }
            p = p*2;
            q++;
            A = A/2;
        }
        return (int)r;
    }
}
