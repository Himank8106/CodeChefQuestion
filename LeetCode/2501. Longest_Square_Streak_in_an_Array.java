/* Link - https://leetcode.com/problems/longest-square-streak-in-an-array/ */

class Solution {
    public int longestSquareStreak(int[] nums) {
        int res = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(nums);
        for(int num: nums){
            int sqrt = (int)Math.sqrt(num);
            if(sqrt*sqrt==num && hm.containsKey(sqrt)){
                hm.put(num, hm.get(sqrt)+1);
                res = Math.max(res, hm.get(num));
            } else hm.put(num, 1);
        }
        return res;
    }
} 
