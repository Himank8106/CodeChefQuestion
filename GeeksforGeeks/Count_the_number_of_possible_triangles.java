/* Link - https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1 */

class Solution {
    static int countTriangles(int arr[]) {
        int n = arr.length;
        if (n < 3) return 0;
        Arrays.sort(arr);
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0; 
            int j = k - 1; 
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);
                    j--; 
                } else {
                    i++; 
                }
            }
        }
        return count;
    }
}
