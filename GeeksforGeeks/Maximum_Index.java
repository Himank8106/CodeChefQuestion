/* Link - https://www.geeksforgeeks.org/problems/maximum-index-1587115620/1 */

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=i; j--){
                if(j-i<max) break;
                if(a[j]>=a[i]) max = Math.max(max, j-i);
            }
        }
        return max;
    }
}
