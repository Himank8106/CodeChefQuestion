/* Link - https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1 */

class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum=0, sum2=0;
        for(int i: arr) sum += i;
        for(int i: arr){
            sum2 += i;
            sum -= i;
            if(sum==sum2) return true;
        }
        return false;
    }
}
