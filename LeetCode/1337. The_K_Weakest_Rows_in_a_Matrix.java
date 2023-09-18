/* Link - https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/ */

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length]; 
        for(int i=0; i<mat.length; i++){
            int sum = 0;
            for(int j=0; j<mat[i].length; j++){
                sum += mat[i][j];
            }
            arr[i] = sum;
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            int index=0, min=arr[0];
            for(int j=1; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            ans[i] = index;
            arr[index] = mat[0].length+1;
        }
        return ans;
    }
}
