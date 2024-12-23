/* Link - https://www.geeksforgeeks.org/problems/search-in-a-row-wise-sorted-matrix/1 */

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int i,j;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==x)return true;
            }
        }
        return false;
    }
}
