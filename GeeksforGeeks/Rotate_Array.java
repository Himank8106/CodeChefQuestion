/* Link - https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1 */

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length, k=0;
        int len = d%n;
        int[] temp = new int[len];
        for(int i=0; i<len; i++) temp[i] = arr[i];
        for(int i=len; i<n; i++) arr[k++] = arr[i];
        for(int i=0; i<len; i++) arr[k++] = temp[i];
    }
}
