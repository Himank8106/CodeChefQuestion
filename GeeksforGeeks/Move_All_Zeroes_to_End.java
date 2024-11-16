/* Link - https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1 */

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                if(i!=count){
                    arr[count] = arr[i];
                    arr[i] = 0;
                }
                count++;
            }
        }
    }
}
