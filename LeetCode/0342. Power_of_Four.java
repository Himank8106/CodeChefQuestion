/* Link - https://leetcode.com/problems/power-of-four/ */

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        double log4 = Math.log(n)/Math.log(4);
        return log4 == (int)log4;
    }
}

// if(n<=0){
//             return false;
//         }
//         if(n%4==0){
//             return isPowerOfFour(n/4);
//         }
//         if(n==1){
//             return true;
//         }
//         return false;
