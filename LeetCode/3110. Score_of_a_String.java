/* Link - https://leetcode.com/problems/score-of-a-string/ */

class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            total += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return total;
    }
}

/*
public class Solution {
    public int scoreOfString(String s) {
        return java.util.stream.IntStream.range(0, s.length() - 1).map(i -> Math.abs(s.charAt(i) - s.charAt(i + 1))).sum();
    }
}
*/
