/* Link - https://www.interviewbit.com/problems/search-for-a-range/ */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        return new int[]{start(A, B),end(A, B)};
    }
    
    private int start(int A[], int B){
        int indx = -1;
        int low = 0, high = A.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(A[mid] >= B) high = mid -1;
            else low = mid + 1;
            if(A[mid] == B) indx = mid;
        }
        return indx;
    }
    
    private int end(int A[], int B){
        int indx = -1;
        int low = 0, high = A.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(A[mid] <= B) low = mid + 1;
            else high = mid - 1;
            if(A[mid] == B) indx = mid;
        }
        return indx;
    }
}
