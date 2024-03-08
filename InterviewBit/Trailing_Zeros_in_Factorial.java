/* Link - https://www.interviewbit.com/problems/trailing-zeros-in-factorial/ */

public class Solution {
    public int trailingZeroes(int A) {
        int res = 0;
        for(int i=5; i<=A; i*=5){
            res += A/i;
        }
        return res;
    }
}
