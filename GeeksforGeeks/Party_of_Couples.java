/* Link - https://www.geeksforgeeks.org/problems/alone-in-couple5507/1 */

class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        int xor = arr[0];
        for(int i=1; i<n; i++){
            xor ^= arr[i];
        }
        return xor;
    }
}
