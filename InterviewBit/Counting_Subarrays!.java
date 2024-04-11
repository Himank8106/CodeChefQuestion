/* Link - https://www.interviewbit.com/problems/counting-subarrays/ */

public class Solution {
    public int solve(int[] A, int B) {
        int start=0, sum=0, count=0, n=A.length;
        for(int end=0; end<n; end++){
            sum += A[end];
            while(sum>=B){
                sum -= A[start];
                start++;
            }
            count += end-start+1;
        }
        return count;
    }
}
