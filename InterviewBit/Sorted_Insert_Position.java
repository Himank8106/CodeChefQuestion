/* Link - https://www.interviewbit.com/problems/sorted-insert-position/ */

public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int left = 0;
        int right = a.size()-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(a.get(mid)==b){
                return mid;
            }
            else if(left==right && a.get(mid)>b){
                return mid;
            }
            else if(left==right && a.get(mid)<b){
                return mid+1;
            }
            else if(a.get(mid)>b){
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return -1;
    }
}
