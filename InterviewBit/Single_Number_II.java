/* Link - https://www.interviewbit.com/problems/single-number-ii/ */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int ans = 0;
        for(int i=0; i<32; i++){
            int bitcount = 0;
            for(int a: A){
                a >>= i;
                if((a&1)==1) bitcount++;
            }
            if(bitcount!=0){
                int rem = bitcount%3;
                ans += Math.pow(2,i)*rem;
            }
        }
        return ans;
    }
}
