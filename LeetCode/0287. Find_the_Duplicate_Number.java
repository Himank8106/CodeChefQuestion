/* Link - https://leetcode.com/problems/find-the-duplicate-number/ */

class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] a = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            if(a[nums[i]]) return nums[i];
            a[nums[i]] = true;
        }
        return -1;
    }
}

/* 
int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        slow = nums[0];
        while(fast!=slow){
            slow=nums[slow];
            fast=nums[fast];
        }
        System.gc();
        return fast;
*/

/* 
HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            if(hs.contains(num)){
                return num;
            }
            hs.add(num);
        }
        return -1;
*/
