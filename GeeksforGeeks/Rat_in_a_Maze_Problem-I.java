/* Link - https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1 */

class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
            return ans; 
        }
        boolean[][] vis = new boolean[n][n];
        dfs(0, 0, mat, vis, "", ans);
        return ans;
    }
    private void dfs(int i, int j, int[][] mat, boolean[][] vis, String path, ArrayList<String> ans){
        int n = mat.length;
        if(i>=n || i<0 || j>=n || j<0 || mat[i][j]==0 || vis[i][j]) return;
        if(i==n-1 && j==n-1){
            ans.add(path);
            return;
        }
        vis[i][j] = true;
        dfs(i,j+1,mat,vis,path+"R",ans);
        dfs(i,j-1,mat,vis,path+"L",ans);
        dfs(i-1,j,mat,vis,path+"U",ans);
        dfs(i+1,j,mat,vis,path+"D",ans);
        vis[i][j] = false;
    }
}
