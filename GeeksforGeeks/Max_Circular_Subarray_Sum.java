/* Link - https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1 */

class Solution {
    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        // Your code here
        int n=arr.length, totalsum=0, maxsofar=0, minsofar=0, 
            maxsum=Integer.MIN_VALUE, minsum=Integer.MAX_VALUE;
        for(int num:arr){
            totalsum+=num;
            maxsofar+=num;
            minsofar+=num;
            maxsum=Math.max(maxsofar,maxsum);
            minsum=Math.min(minsofar,minsum);
            if(maxsofar<0){
                maxsofar=0;
            }
            if(minsofar>0){
                minsofar=0;
            }
        }
        return Math.max(totalsum-minsum,maxsum);
    }
}
