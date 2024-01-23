/* Link - https://leetcode.com/problems/number-of-1-bits/ */

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bitCount = 0;
        while(n != 0){
            bitCount++;
            n &= (n-1);
        }
        return bitCount;
    }
}
