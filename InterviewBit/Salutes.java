/* Link - https://www.interviewbit.com/problems/salutes/ */

public class Solution {
    public long countSalutes(String A) {
        long c=0, ans=0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='>') c++;
            else ans+=c;
        }
        return ans;
    }
}
