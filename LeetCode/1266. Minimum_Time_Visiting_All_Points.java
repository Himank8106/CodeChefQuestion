/* Link - https://leetcode.com/problems/minimum-time-visiting-all-points/ */

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length-1; i++) {
            int x = points[i][0], y = points[i][1], 
                a = points[i+1][0], b = points[i+1][1];
            time += Math.max(Math.abs(a - x), Math.abs(b - y));
        }
        return time;
    }
}

/* 
int len = 0;
        for(int a = 0; a < points.length-1; a++){
            len += Math.max(Math.abs(points[a][0]-points[a+1][0]), 
                            Math.abs(points[a][1]-points[a+1][1]));
        }
        return len;
*/
