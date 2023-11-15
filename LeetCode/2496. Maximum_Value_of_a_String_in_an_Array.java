/* Link - https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/ */

class Solution {
    public int maximumValue(String[] strs) {
        
        int ans = 0;


        for (var s : strs) {
            ans = Math.max(ans, f(s));
        }

        return ans;
    }

        private int f(String s) {
        int x = 0;
        for (int i = 0, n = s.length(); i < n; ++i) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                return n;
            }
            x = x * 10 + (c - '0');
        }
        return x;
    }
}


    /* 
    int max = Integer.MIN_VALUE;
        for(String s : strs){
            boolean isDigit = true;
            for(char c : s.toCharArray()){
                if(c >= '0' && c <= '9')
                    continue;
                else{
                    max = Math.max(max, s.length());
                    isDigit = false;
                    break;
                }
            }
            if(isDigit){
                max = Math.max(max, Integer.parseInt(s));
            }
        }
        return max;
    */
