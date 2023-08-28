/* Link - https://leetcode.com/problems/create-target-array-in-the-given-order/ */

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }
        for(int j=0; j<nums.length; j++){
            ans[j] = arr.get(j); 
        }
        return ans;
    }
}
