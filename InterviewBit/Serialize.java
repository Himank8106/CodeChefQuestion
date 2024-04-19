/* Link - https://www.interviewbit.com/problems/serialize/ */

public class Solution {
    public String serialize(String[] A) {
        String s="";
        for(int i=0;i<A.length;i++){
             
            s= s+A[i]+Integer.toString(A[i].length())+"~";
        }
        return s;
    }
}
