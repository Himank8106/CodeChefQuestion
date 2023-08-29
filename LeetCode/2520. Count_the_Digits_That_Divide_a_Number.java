/* Link - https://leetcode.com/problems/count-the-digits-that-divide-a-number/ */

class Solution {
    public int countDigits(int n) {
        int m = n, ans = 0;
        while(m > 0){
            if(n % (m % 10) == 0) ans++;
            m /= 10;
        }
        return ans;
    }
}
