/* Link - https://leetcode.com/problems/container-with-most-water/ */

class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int l = 0, r = height.length - 1;
        while(l < r){
            int minHeight = height[l] < height[r] ? height[l] : height[r];
            water = Math.max(water, minHeight * (r - l));
            while(l < r && height[l] <= minHeight) l++;
            while(l < r && height[r] <= minHeight) r--;
        }
        return water;
    }
}
