/* Link - https://leetcode.com/problems/n-repeated-element-in-size-2n-array/ */

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num:nums){
            if(s.contains(num)){
                System.gc();
                return num;
            }
            else{
                s.add(num);
            }
        }
        return 0;
    }
}

/* 
Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 1;
*/
