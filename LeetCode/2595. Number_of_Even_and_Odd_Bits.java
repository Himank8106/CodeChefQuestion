/* Link - https://leetcode.com/problems/number-of-even-and-odd-bits/ */

class Solution {
    public int[] evenOddBit(int n) {
        var even = 0;
        var odd = 0;
        for (var i=0; n > 0; i++, n /= 2) {
            if (i % 2 == 0)
                even += (n & 1);
            else
                odd += (n & 1);
            }
        return new int[] {even, odd};
    }
}


    // int even = 0, odd = 0, idx = 0;
    //     while (n > 0) {
    //         int rem = n % 2;     
    //         if (idx % 2 == 0 && rem == 1) {
    //             even += 1;
    //         } else if (idx % 2 != 0 && rem == 1) {
    //             odd += 1;
    //         }
    //         idx += 1;
    //         n = n / 2;
    //     }  
    //     int ans[] = new int[2];
    //     ans[0] = even;
    //     ans[1] = odd;
    //     return ans;
