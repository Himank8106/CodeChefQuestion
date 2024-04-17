/* Link - https://www.interviewbit.com/problems/max-continuous-series-of-1s/ */

public class Solution {
    public int[] maxone(int[] A, int B) {
        int n=A.length, startIdx=0, endIdx=0, max=0, leftPtr=0, zeroCnt=0;
        for(int rightCnt=0; rightCnt<n; rightCnt++){
            if(A[rightCnt]==0) zeroCnt++;
            while(zeroCnt>B){
                if(A[leftPtr]==0) zeroCnt--;
                leftPtr++;
            }
            if(rightCnt-leftPtr+1>max){
                max = rightCnt-leftPtr+1;
                startIdx = leftPtr;
                endIdx = rightCnt;
            }
        }
        int[] ans = new int[max];
        for(int i=startIdx; i<=endIdx; i++){
            ans[i-startIdx] = i;
        }
        return ans;
    }
}
