/* Link - https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1 */

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int l=1, r=1, max=Integer.MIN_VALUE;
        for(int i=0,j=arr.length-1; i<arr.length && j>=0; i++,j--){
            l *= arr[i];
            r *= arr[j];
            if(l>max) max = l;
            if(r>max) max = r;
            if(l==0) l = 1;
            if(r==0) r = 1;
        }
        return max;
    }
}
