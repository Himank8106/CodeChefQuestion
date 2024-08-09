/* Link - https://www.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1 */ 

class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = (ans + arr[i]*(long)i)%1000000007;
        }
        return (int)ans%1000000007;
    }
}
