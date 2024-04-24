/* Link - https://www.interviewbit.com/problems/longest-common-prefix/ */

public class Solution {
    public String longestCommonPrefix(String[] A) {
        if(A==null || A.length==0){
            return "";
        }
        Arrays.sort(A);
        String first=A[0];
        String last=A[A.length-1];
        int c=0;
        while(c<first.length() && first.charAt(c)==last.charAt(c)){
            c++;
        }
        return first.substring(0,c);
    }
}
