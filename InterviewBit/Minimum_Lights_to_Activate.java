/* Link - https://www.interviewbit.com/problems/minimum-lights-to-activate/ */

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int b=--B,count=0,k,l = A.size(),li1 = Integer.MAX_VALUE-10000, pi1 = -1*li1;
        int[] pa = new int[l], sa = new int[l];
        for (int i = 0; i < l; i++)
            {
                if (A.get(i) == 0)
                    pa[i] = i-pi1;
                else
                    pa[pi1=i] = 0;
                if(A.get(k=l-i-1)==0)
                    sa[k]=li1-k;
                else
                    sa[li1=k]=0;
            }
        for (int i = 0; i < l; i+=b*2+1,count++)
            if (pa[i] > b && sa[i] > b)
                return -1;
    return count;
    }
}
