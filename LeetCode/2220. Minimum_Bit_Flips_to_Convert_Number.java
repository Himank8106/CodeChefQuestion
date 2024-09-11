/* Link - https://leetcode.com/problems/minimum-bit-flips-to-convert-number/ */

class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        String s = Integer.toBinaryString(start^goal);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
}
