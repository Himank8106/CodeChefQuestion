/* Link - https://www.interviewbit.com/problems/reverse-bits/ */

public class Solution {
    public long reverse(long a) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((a & 1) == 1)
                result |= 1;
            a >>= 1;
        }
        return result;
    }
}
