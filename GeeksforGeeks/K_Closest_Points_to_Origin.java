/* Link - https://www.geeksforgeeks.org/problems/k-closest-points-to-origin--172242/1 */

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        int res[][] = new int[k][2];
        Arrays.sort(points, (a, b) -> {
           return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]); 
        });
        
        int idx=0;
        while(idx < k) {
            res[idx] = points[idx];
            idx++;
        }
        
        return res;
    }
}
