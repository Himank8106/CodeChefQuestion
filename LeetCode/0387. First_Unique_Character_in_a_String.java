/* Link - https://leetcode.com/problems/first-unique-character-in-a-string/ */

class Solution {
    public int firstUniqChar(String s) {
        int[] ch = new int[26];
        int index = -1;
        for(int i = 0; i < s.length(); i++) {
            ++ch[(s.charAt(i) - 'a')];
        }
        for(int i = 0; i < s.length(); i++) {
            if(ch[s.charAt(i) - 'a'] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}
