/* Link - https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1 */

class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int l = arr.length;
        Arrays.sort(arr);
        int ans = 1;
        int i = 0;
        while((i < l) && arr[i]<0){
            i++;
        }
        if(i >= l || (arr[i] > 1)) return 1;
        int j;
        for(j = i; j < l-1; j++){
            if(Math.abs(arr[j] - arr[j+1]) > 1){
                break;
            }
        }
        return arr[j]+1;
    }
}
