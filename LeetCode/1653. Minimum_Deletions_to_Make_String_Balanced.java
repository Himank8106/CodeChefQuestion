/* Link - https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/ */

class Solution {
    public int minimumDeletions(String s) {
        int a=0, b=0, min= Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            a += 'b'-s.charAt(i);
        }
        for(int i=0; i<s.length(); i++){
            min = Math.min(min, a+b);
            a -= 'b'-s.charAt(i);
            b += s.charAt(i)-'a';
        }
        return Math.min(min, a+b);
    }
}
