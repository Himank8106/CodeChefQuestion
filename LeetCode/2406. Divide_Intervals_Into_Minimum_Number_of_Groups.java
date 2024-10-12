/* Link - https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/ */

class Solution {
    public int minGroups(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int count=0, en=0;
        for(int st: start){
            if(st>end[en]) en++;
            else count++;
        }
        return count;
    }
}
