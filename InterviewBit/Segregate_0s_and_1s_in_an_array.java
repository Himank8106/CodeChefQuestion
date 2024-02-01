/* Link - https://www.interviewbit.com/problems/segregate-0s-and-1s-in-an-array/ */

public class Solution {
    public int[] solve(int[] A) {
        int count0=0,count1=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
            {
              count0++;
              }
              else
              {
              count1++;
            }
          }
          for(int i=0;i<count0;i++)
          {
            A[i]=0;
          }
           for(int i=count0;i<count1+count0;i++)
          {
            A[i]=1;
          }
        return A;
    }
}
