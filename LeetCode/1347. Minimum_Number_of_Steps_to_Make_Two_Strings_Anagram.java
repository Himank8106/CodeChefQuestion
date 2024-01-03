/* Link - https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram */

class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        int[] arr = new int[26];
        for(char c: s.toCharArray()) ++arr[c-'a'];
        for(char ch: t.toCharArray()){
            --arr[ch-'a'];
            if(arr[ch-'a']<0) ++ans;
        }
        return ans;
    }
}
