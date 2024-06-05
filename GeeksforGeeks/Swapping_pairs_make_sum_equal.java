/* Link - https://www.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1 */

class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        long sum1 = 0, sum2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<n; i++) sum1 += a[i];
        for(int i=0; i<m; i++) sum2 += b[i];
        long target = sum1-sum2;
        int i=0,j=0;
        while(i<a.length && j<b.length){
            long cur = 2*(a[i]-b[j]);
            if(cur==target) return 1;
            else if(cur<target) i++;
            else j++;
        }
        return -1;
    }
}
