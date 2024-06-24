/* Link - https://www.geeksforgeeks.org/problems/summed-matrix5834/1 */

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        if(q>n*2 || q==1) return 0;
        Long l = Math.abs(n+1-q);
        return n-l;
    }
}
