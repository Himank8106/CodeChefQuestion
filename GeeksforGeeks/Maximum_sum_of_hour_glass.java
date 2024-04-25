/* Link - https://www.geeksforgeeks.org/problems/maximum-sum-of-hour-glass3842/1 */

class Solution {
    int findMaxSum(int n, int m, int arr[][]) {
        // code here
        if(n<3 || m<3) return -1;
        int sum=0, max=0;
        for(int i=0; i<n-2; i++){
            for(int j=0; j<m-2; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>max) max=sum;
            }
        }
        return max;
    }
};
