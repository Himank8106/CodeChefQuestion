/* Link - https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums */

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int ans[][]=new int[rowSum.length][colSum.length];

        int i=0;
        int j=0;
        while(i <rowSum.length && j< colSum.length){
            int val= Math.min(rowSum[i], colSum[j]);
            rowSum[i]-=val;
            colSum[j]-=val;
            ans[i][j]=val;

            if(rowSum[i]==0){
                i++;
            }
            if(colSum[j]==0){
                j++;
            }
        }
        return ans;
    }
}
