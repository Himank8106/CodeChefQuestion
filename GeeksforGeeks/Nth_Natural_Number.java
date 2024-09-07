/* Link - https://www.geeksforgeeks.org/problems/nth-natural-number/1 */

class Solution {
    long findNth(long n) {
        // code here
        long ans=0, mul=1;
        while(n>0){
            ans = (n%9)*mul+ans;
            n/=9;
            mul*=10;
        }
        return ans;
    }
}
