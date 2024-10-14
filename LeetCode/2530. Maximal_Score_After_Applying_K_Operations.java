/* Link - https://leetcode.com/problems/maximal-score-after-applying-k-operations/ */

class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        while(k-->0){
            int x = pq.poll();
            score += x;
            // pq.add((int)Math.ceil(x/3.0));  /* instead do (x+2)/3*/
            pq.add((x+2)/3);
        }
        return score;
    }
}
