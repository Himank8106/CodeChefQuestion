/* Link - https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1 */

class Solution {
    int countPairs(int arr[], int target) {
        // Complete the function
        int ans=0, i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                ans++;
                int ti = i+1, tj = j-1;
                while(ti<j){
                    if(arr[ti]+arr[j]==target) ans++;
                    ti++;
                }
                while(tj>i){
                    if(arr[tj]+arr[i]==target) ans++;
                    tj--;
                }
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>target) j--;
            else i++;
        }
        return ans; 
    }
}
