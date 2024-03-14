/* Link - https://www.interviewbit.com/problems/trailing-zeroes/ */

public class Solution {
    public int solve(int A) {
        int count = 0;
        while(A>0){
            if(A%2==0){
                count++;
            }
            else{
                break;
            }
            A /= 2;
        }
        return count;
    }
}
