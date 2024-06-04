/* Link - https://leetcode.com/problems/longest-palindrome/ */

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int length = 0;
        for(char c: s.toCharArray()){
            if(hs.contains(c)){
                hs.remove(c);
                length += 2;
            } else{
                hs.add(c);
            }
        }
        if(!hs.isEmpty()) length += 1;
        return length;
    }
}
