/* Link - https://www.geeksforgeeks.org/problems/play-with-or5515/1 */

class Solution{  
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        int[] ans = new int[n];
        for(int i=0; i<arr.length-1; i++){
            ans[i] = arr[i] | arr[i+1];
        }
        ans[n-1] = arr[n-1];
        return ans;
    }
}


