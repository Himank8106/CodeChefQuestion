/* Link - https://leetcode.com/problems/find-the-pivot-integer/ */

class Solution {
    public int pivotInteger(int n) {
        int rhs=((n*n)+n)/2;
        int ans=(int)Math.sqrt(rhs);
        if(ans*ans==rhs){
            return ans;
        }
        return -1;
    }
}

/* 
int sum = (n*(n+1))/2;
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans += i;
            if(sum - ans + i == ans){
                return i;
            }
        }
        return -1;
*/
