/* Link - https://www.interviewbit.com/problems/smaller-or-equal-elements/ */

public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        int low = 0, high = A.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(A[mid] == B){
                count = mid+1;
                low = mid + 1;
            }else if(A[mid] < B){
                low = mid + 1;
                count = mid+1;
            }else{
                 high = mid - 1;
                 count = mid;
            }
        }
        return count;
    }
}
