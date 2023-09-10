/* Link - https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/ */

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxSoFar = -1;
        int count = 0;
        for (int i = 0; i < rectangles.length; i ++) {
            int minSide = Math.min(rectangles[i][0], rectangles[i][1]);
            if (minSide > maxSoFar) {
                maxSoFar = minSide;
                count = 0;
            }
            
            if (minSide == maxSoFar) {
                count ++;
            }
        }
        System.gc();
        return count;
    }
}

    /* 
     int[] arr = new int[rectangles.length];
        for(int i=0; i<rectangles.length; i++){
            arr[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }
        Arrays.sort(arr);
        int count = 1;
        for(int i = arr.length-1; i>=1; i--){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    */
