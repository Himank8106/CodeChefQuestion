/* Link - https://www.geeksforgeeks.org/problems/toeplitz-matrix/1 */

class Solution {
    /*You are required to complete this method*/
    boolean isToeplitz(int mat[][]) {
        // Your code here
        int n = mat.length;
        int m = mat[0].length;

        for(int i=1;i<n;i++) {
            for(int j=1;j<m;j++) {
                if(mat[i][j] != mat[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
