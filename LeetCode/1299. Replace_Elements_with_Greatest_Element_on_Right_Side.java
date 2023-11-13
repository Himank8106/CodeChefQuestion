/* Link - https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/ */

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int[] nums = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            nums[i] = max;
            max = Math.max(arr[i],max);
        }
        return nums;
    }
}
