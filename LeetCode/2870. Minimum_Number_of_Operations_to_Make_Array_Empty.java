/* Link - https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty */

class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int s = 0;
        while(s < nums.length){
            int e = s;
            while(e < nums.length && nums[e] == nums[s]) {
                e++;
            }
            int count = e-s;
            if(count == 1) return -1;
            res += count/3;

            if(count%3 != 0) res++;
            s=e;
        }
        return res;
    }
}

/* 
Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int t = entry.getValue();
            if (t == 1)
                return -1;
            count += t / 3; 
            if (t % 3 != 0)
                count++;
        }
        return count;
*/
