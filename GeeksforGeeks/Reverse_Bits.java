/* Link - https://www.geeksforgeeks.org/problems/reverse-bits3556/1 */

class Solution {
    static Long reversedBits(Long x) {
        // code here
        String s = Long.toBinaryString(x);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        for(int i=sb.length(); i<32; i++){
            sb.append("0");
        }
        long ans = Long.parseLong(sb.toString(),2);
        return ans;
    }
};
