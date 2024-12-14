/* Link - https://leetcode.com/problems/continuous-subarrays/ */

class Solution {
    public long continuousSubarrays(int[] nums) {
        int l=0;
        long res=0;
        Deque<Integer> min = new LinkedList<>(), max = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            while(!min.isEmpty() && nums[min.peekLast()]>=nums[i]){
                min.pollLast();
            }
            while(!max.isEmpty() && nums[max.peekLast()]<=nums[i]){
                max.pollLast();
            }
            min.offerLast(i);
            max.offerLast(i);
            while(nums[max.peekFirst()]-nums[min.peekFirst()]>2){
                l++;
                if(min.peekFirst()<l) min.pollFirst();
                if(max.peekFirst()<l) max.pollFirst();
            }
            res += i-l+1;
        }
        return res;
    }
} 
