/* Link - https://www.geeksforgeeks.org/problems/gray-to-binary-equivalent-1587115620/1 */

class Solution{
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        // Your code here
        int num = 0;
        while (n != 0) {
        num ^= n;
        n >>= 1;
        }
        return num;
    }
}
