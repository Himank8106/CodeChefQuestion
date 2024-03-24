/* Link - https://www.interviewbit.com/problems/search-in-bitonic-array/ */

public class Solution {
        public int solve(int[] a, int b) {
        int l = 0, r = a.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid] == b) return mid;
            if(b<a[mid] && b>=a[l]) r = mid-1;
            else if(mid<a.length && a[mid] > a[mid+1] && b<=a[mid+1] && b>=a[r]){
                return findRight(a,mid+1,r,b);
            }else l = mid+1;
        }
        return -1;
    }
   
    static int findRight(int[] a,int l,int r,int b){
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid] == b) return mid;
            if(b>a[mid]) r = mid-1;
            else l = mid+1;
        }
        return -1;
    }
}
