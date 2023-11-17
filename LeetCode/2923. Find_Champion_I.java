/* Link - https://leetcode.com/problems/find-champion-i/ */

class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        for(int i = 0; i < n; i++) {
            boolean found = true;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if(grid[i][j] != 1) {
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return 0;
    }
}

/* 
for(int i=0; i<grid.length; i++){
            boolean b = true;
            for(int j=0; j<grid.length; j++){
                if(i!=j && grid[i][j]==0) b =false;
            }
            if(b) return i;
        }
        return -1;
*/
