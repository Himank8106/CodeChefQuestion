/* Link - https://leetcode.com/problems/contiguous-array/ */

class Solution {
    public int findMaxLength(int[] nums) {
        int N = nums.length;
        int[] mp = new int[2*N+2];
        int current = N;
        int result = 0;

        for(int i = 0; i < N; i++) {
            current += (nums[i] << 1) - 1;
            if(current == N) {
                result = i+1;
            }
            else if(mp[current] == 0) {
                mp[current] = i+1;
            }
            else {
                result = Math.max(result, i - mp[current]+1);
            }
        }
        return result;
    }
}

/*
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int subArrayLength = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                subArrayLength = i + 1;
            } else if (mp.containsKey(sum)) {
                subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return subArrayLength;
    }
}
*/
