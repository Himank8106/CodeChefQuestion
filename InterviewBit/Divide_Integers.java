/* Link - https://www.interviewbit.com/problems/divide-integers/ */

public class Solution {
    public int divide(int divident, int divisor) {
        boolean isNegative=false;
        if(divident<0 && divisor>0  || divident>0 &&divisor<0 )
        {
            isNegative=true;
        }
        long ldivident=Math.abs((long)divident);
        long ldivisor=Math.abs((long)divisor);
        long ans =0;
        long cur=1;
        long sub=ldivisor;
        while(ldivident>=ldivisor)
        {
            if(ldivident>=sub)
            {
                ans+=cur;
                ldivident-=sub;
                cur=cur<<1;
                sub=sub<<1;
            }
            else{
                cur=cur>>1;
                sub=sub>>1;
            }

        }
        ans= isNegative==true?-ans:ans;
        return ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE?Integer.MAX_VALUE:(int)ans;
    }
}
