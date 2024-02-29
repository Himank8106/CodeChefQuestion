/* Link - https://www.interviewbit.com/problems/is-rectangle/ */

public class Solution {
    public int solve(int a, int b, int c, int d) {
        if(a==b && c==d)
            return 1;
        if(a==c && b==d)
            return 1;
        if(a==d && b==c)
            return 1;
        else
            return 0;
    }
}
