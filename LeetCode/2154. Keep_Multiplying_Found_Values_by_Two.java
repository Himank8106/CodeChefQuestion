/* Link - https://leetcode.com/problems/keep-multiplying-found-values-by-two/ */

class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            set.add(x);
        }    
        while(set.contains(original))
        {
            original*=2;
        }
        return original;
    }
}

/* 
for(int num : nums){
            if(num==original){
                return findFinalValue(nums,original*2);
            }
        }
        return original;
*/ 

/* 
Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == original) original *= 2; 
        }
        return original;
*/

