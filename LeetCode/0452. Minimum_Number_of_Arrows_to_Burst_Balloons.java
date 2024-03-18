/* Link - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/ */

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> {
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int count = 0;
        int prev = points[0][1];
        for(int i=1; i<points.length; i++){
            if(prev >= points[i][0]){
                if(prev > points[i][1]) prev = points[i][1];
            }
            else{
                prev = points[i][1];
                count++;
            }
        }
        return count+1;
    }
}
