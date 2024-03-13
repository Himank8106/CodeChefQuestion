/* Link - https://www.interviewbit.com/problems/single-number/ */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        Integer ans=0;
        for(Integer a:A){
            ans=ans^a;
        }
        return ans;
    }
}
