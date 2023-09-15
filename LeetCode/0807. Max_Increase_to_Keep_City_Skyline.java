/* Link - https://leetcode.com/problems/max-increase-to-keep-city-skyline/ */

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        final int n = grid.length;
        int[] colmax = new int[n];
        int[] rowmax = new int[n];

        for(int i = 0; i < n; i++){
            colmax[i] = grid[0][i];
            rowmax[i] = grid[i][0];
            for(int j = 1; j < n; j++) {
                colmax[i] = (colmax[i] < grid[j][i]) ? grid[j][i] : colmax[i];
                rowmax[i] = (rowmax[i] < grid[i][j]) ? grid[i][j] : rowmax[i];
            }
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += ((rowmax[i] < colmax[j]) ? rowmax[i] : colmax[j]) - grid[i][j];
            }
        }

        rowmax = null;
        colmax = null;
        System.gc();

        return sum;
    }
}

/* 
int n = grid.length;
        int[] row = new int[n];
        int[] col = new int[n];

        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                max = Math.max(grid[i][j], max);
            }
            row[i] = max;
        }

        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                max = Math.max(grid[j][i], max);
            }
            col[i] = max;
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int max = Math.min(row[i],col[j]);
                if(grid[i][j]<max){
                    ans+= max-grid[i][j];
                }
            }
        }
        return ans;
*/
