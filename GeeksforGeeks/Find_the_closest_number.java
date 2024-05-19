/* Link - https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1 */


class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        int min = Integer.MAX_VALUE;
        int target = 0;
        
        for(int i=n-1; i>=0; i--){
            if(Math.abs(arr[i]-k) < min){
                target = arr[i];
                min = Math.abs(arr[i]-k);
            }
        }
        
        return target;
    }
}
        
