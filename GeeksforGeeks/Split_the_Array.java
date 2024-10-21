/* Link - https://www.geeksforgeeks.org/problems/split-the-array0238/1 */

class Solution {
    public static int countgroup(int arr[]) {
        int a = 0;
        for (int i : arr) {
            a ^= i;  
        }
        if (a == 0) {
            int n = arr.length;
            return (int)Math.pow(2, n - 1)-1;
        }
        return 0;
    }
}
