/* Link - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/ */

class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]<0)
                count++;
            }
        }
        System.gc();
        return count;
    }
}
