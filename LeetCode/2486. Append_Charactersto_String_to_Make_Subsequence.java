/* Link - https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/ */

class Solution {
    public int appendCharacters(String s, String t) {
        char[] ch = t.toCharArray();
        int j=0;
        for(int i=0; i<s.length() && j<t.length(); i++){
            if(s.charAt(i)==ch[j]) ++j;
        }
        return t.length()-j;
    }
}
