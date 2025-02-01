/* Link - https://www.geeksforgeeks.org/problems/word-search/1 */

class Solution {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
        
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int rows = mat.length;
        int cols = mat[0].length;
        visited = new boolean[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(backtrack(mat,i,j,word,0)) return true;
            }
        }
        return false;
    }
    
    static private boolean backtrack(char[][] mat, int i, int j, String word, int index){
        if(index==word.length()) return true;
        if(i<0 || i>=mat.length || j<0 || j>=mat[0].length || word.charAt(index)!=mat[i][j]
            || visited[i][j]==true) return false;
        visited[i][j] = true;
        boolean ans = backtrack(mat, i+dx[0], j+dy[0], word, index+1) ||
        backtrack(mat, i+dx[1], j+dy[1], word, index+1) ||
        backtrack(mat, i+dx[2], j+dy[2], word, index+1) ||
        backtrack(mat, i+dx[3], j+dy[3], word, index+1);
        visited[i][j] = false;
        return ans;
    } 
}
