/* Link - https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1 */

class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int l=0, r=arr.length-1;
        Arrays.sort(arr);
        int ans = 0;
        while(l<r){
            if((arr[l]+arr[r])<target){
                ans += (r-l);
                l++;
            } else r--;
        }
        return ans;
    }
}
