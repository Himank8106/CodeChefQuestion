/* Link - https://www.geeksforgeeks.org/problems/the-celebrity-problem/1 */

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length, a=0, b=n-1;
        while(a<b){
            if(mat[a][b]==1) a++;
            else b--;
        }
        int cand = a;
        for(int i=0; i<n; i++){
            if(i!=cand){
                if(mat[cand][i]==1 || mat[i][cand]==0) return -1;
            }
        }
        return cand;
    }
}
