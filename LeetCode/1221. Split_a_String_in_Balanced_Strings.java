/* Link - https://leetcode.com/problems/split-a-string-in-balanced-strings/ */

class Solution {
    public int balancedStringSplit(String s) {
        if(s==null || s.isBlank()) return 0;
        int res = 0;
        int L = 0;
        int R = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr=='L'){
                L++;
            }
            if(curr=='R'){
                R++;
            }
            if(L==R){
                res++;
            }
        }
        return res;
    }
}

/* 
        int balance = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
*/
