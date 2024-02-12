/* Link - https://www.geeksforgeeks.org/problems/recursive-sequence1611/1 */

class Solution{
    static long sequence(int n){
        // code here
        long mod = 1000000007;
        long prod = 1;
        long sum = 0;
        for(int i=0; i<n; i++){
            int j = i+1;
            long subsum = 1;
            while(j!=0){
                subsum = (subsum*prod)%mod;
                j--;
                prod++;
            }
            sum = (sum+subsum)%mod;
        }
        return sum%mod;
    }
}
