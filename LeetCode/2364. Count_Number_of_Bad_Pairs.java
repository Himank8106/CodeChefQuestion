/* Link - https://leetcode.com/problems/count-number-of-bad-pairs/ */

class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> bag = new HashMap<>();
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += -1 + bag.merge(nums[i] - i, 1, Integer::sum);
        }
        int len = nums.length;
        return 1L * len * (len - 1) / 2 - count;
    }
}

/* 
import java.util.HashMap;
import java.util.Map;
class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long)n * (n - 1) / 2;
        Map<Integer, Long> diffCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            totalPairs -= diffCount.getOrDefault(diff, 0L);
            diffCount.put(diff, diffCount.getOrDefault(diff, 0L) + 1);
        }
        return totalPairs;
    }
}
*/
