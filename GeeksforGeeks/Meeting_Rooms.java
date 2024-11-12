/* Link - https://www.geeksforgeeks.org/problems/attend-all-meetings/1 */

class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        if(arr.length<2) return true;
        int[] start = new int[arr.length];
        int[] end = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=1; i<arr.length; i++){
            if(start[i]<end[i-1]) return false;
        }
        return true;
    }
}
