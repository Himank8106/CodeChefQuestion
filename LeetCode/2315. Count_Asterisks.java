/* Link - https://leetcode.com/problems/count-asterisks/ */

class Solution {
    public int countAsterisks(String s) {
        int asterisks = 0;
        boolean pair = false;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                pair = !pair;
            }

            if (!pair && c == '*') {
                asterisks++;
            }
        }
        return asterisks;       
    }
}

/* 
        int count = 0, ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='|'){
                count++;
            }
            if(count%2==0){
                if(s.charAt(i)=='*'){
                    ans++;
                }
            }
        }
        return ans;
*/
