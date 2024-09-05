/* Link - https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1 */

class Solution {
    int missingNumber(int n, int array[]) {
        // Your Code Here
        int sum1  = 0;
        int sum2 = 0;
        for(int i=0; i < array.length; i++){
            sum1 += array[i];
           
        }
        for(int i=1; i <= n; i++){
            sum2 += i;
        }
        return sum2-sum1;
    }
}
