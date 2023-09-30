/* Link - https://leetcode.com/problems/row-with-maximum-ones/ */

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>arr[1]){
                arr[1] = count;
                arr[0] = i;
            }
        }
        return arr;
    }
}

/* 
int maxOneRow = 0;
        int maxOnes = 0;

        for (int i = 0; i < mat.length; ++i) {
            int ones = 0;
            for (int ele : mat[i]) {
                ones += ele;
            }

            if (ones > maxOnes) {
                maxOneRow = i;
                maxOnes = ones;
            }
        }

        System.gc();
        return new int[]{maxOneRow, maxOnes};
*/
