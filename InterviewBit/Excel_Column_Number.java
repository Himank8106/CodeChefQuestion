/* Link - https://www.interviewbit.com/problems/excel-column-number/ */

public class Solution {
    public int titleToNumber(String A) {
        int res = 0;
        for(int i=0; i<A.length(); i++){
            int curr = A.charAt(i)-'A'+1;
            res = res*26 + curr;
        }
        return res;
    }
}
