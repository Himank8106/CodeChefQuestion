/* Link - https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/ */

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = 0;
        int[] arr = new int[points.length];
        for(int i=0; i<points.length; i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        for(int i=0; i<points.length-1; i++){
            ans = Math.max(ans, arr[i+1]-arr[i]);
        }
        return ans;
    }
}
