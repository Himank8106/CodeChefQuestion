/* Link - https://www.geeksforgeeks.org/problems/square-root/1 */

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        long l=0, h=n, ans=1;
        while(l<=h){
            long mid = (l+h)/2;
            if(mid*mid<=n){
                ans = mid;
                l=mid+1;
            } else h=mid-1;
        }
        return ans;
    }
}

// return (long) Math.sqrt(n);
