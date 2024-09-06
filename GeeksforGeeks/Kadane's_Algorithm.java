/* Link - https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1 */

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int max = Integer.MIN_VALUE, sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
}
