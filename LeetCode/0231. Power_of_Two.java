/* Link - https://leetcode.com/problems/power-of-two/ */

class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1) {
            return false;
        }
        return isPowerOfTwo(n / 2);
        
    }
}

/*
public class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}
*/
