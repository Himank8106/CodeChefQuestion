/* Link - https://leetcode.com/problems/minimize-string-length/ */

class Solution {
    public int minimizedStringLength(String s) {
        int ans = 0;
        char[] ch = s.toCharArray();
        int[] count = new int[26];
        for(int i: ch){
            count[i-'a']++;
        }
        for(int i: count){
            if(i>0){
                ans++;
            }
        }
        return ans;
    }
}
