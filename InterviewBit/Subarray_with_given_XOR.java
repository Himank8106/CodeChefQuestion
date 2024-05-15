/* Link - https://www.interviewbit.com/problems/subarray-with-given-xor/ */

public class Solution {
    public int solve(int[] A, int B) {
        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize map with (0, 1) to handle the case when xor of prefix is equal to B.
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            xr ^= A[i];
            int x = xr ^ B;
            count += map.getOrDefault(x, 0);
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return count;
    }
}
