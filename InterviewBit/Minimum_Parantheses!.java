/* Link - https://www.interviewbit.com/problems/minimum-parantheses/ */

public class Solution {
    public int solve(String A) {
        int open=0, close=0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='(') open++;
            else{
                if(open>0) open--;
                else close++;
            }
        }
        return Math.abs(open+close);
    }
}
