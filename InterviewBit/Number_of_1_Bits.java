/* Link  - https://www.interviewbit.com/problems/number-of-1-bits/ */

public class Solution {
	public int numSetBits(long a) {
		int onesCount = 0;
        while(a>0)
        {
            if((a&1)==1)
            {
                onesCount++;
            }
            a=a>>1;
        }
        return onesCount;
	}
}
