/* Link - https://leetcode.com/problems/projection-area-of-3d-shapes/ */

class Solution {
    public int projectionArea(int[][] grid) {
        int a=0, x=0;
        for(int i=0; i<grid.length; i++){
            int maxy = Integer.MIN_VALUE;
            int maxz = Integer.MIN_VALUE;
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != 0) x++;
                if(grid[i][j]>maxy) maxy = grid[i][j];
                if(grid[j][i]>maxz) maxz = grid[j][i];
            }
            a += maxy+maxz;
        } 
        return a+x;
    }
}
