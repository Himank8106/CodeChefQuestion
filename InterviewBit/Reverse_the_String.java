/* Link - https://www.interviewbit.com/problems/reverse-the-string/ */

public class Solution {
    public String solve(String A) {
        String[] str = A.trim().split("\\s+");
        String ans = "";
        for(int i=str.length-1; i>=1; i--){
            ans += str[i]+" ";
        }
        ans += str[0];
        return ans;
    }
}
