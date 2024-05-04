/* Link - https://www.interviewbit.com/problems/pairs-with-given-xor/ */

public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : A) {
            int complement = B ^ num;
            if (map.containsKey(complement)) {
                count++;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
