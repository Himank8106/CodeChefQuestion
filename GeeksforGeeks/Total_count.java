/* Link - https://www.geeksforgeeks.org/problems/total-count2415/1 */

class Solution {
    int totalCount(int k, int[] arr) {
        // code here
            int cnt=0;
        for(int val:arr){
            cnt+=(int)Math.ceil((val/(double)k));
        }
        return cnt;
    }
}
