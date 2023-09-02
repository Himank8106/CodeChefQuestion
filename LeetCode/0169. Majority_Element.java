/* Link - https://leetcode.com/problems/majority-element/ */

class Solution {
    public int majorityElement(int[] a) {
        Arrays.sort(a);
        return a[a.length/2];
    }
}
