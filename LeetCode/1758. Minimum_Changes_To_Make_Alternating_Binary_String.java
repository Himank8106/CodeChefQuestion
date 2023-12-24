/* Link - https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/ */

class Solution {
    public int minOperations(String s) {
        char c_0 = s.charAt(0);
        int count1 = count(s, c_0);
        int count2 = count(s, c_0=='0'?'1':'0')+1;
        return Math.min(count1, count2);
    }

    private int count(String s, char c_pre){
        int count = 0;
        for(int i=1; i<s.length(); i++){
            char current = s.charAt(i);
            if(current==c_pre){
                count++;
                c_pre = c_pre == '0' ? '1' : '0';
            }else{
                c_pre = current;   
            }
        }
        return count;
    }
}


/* 
  int n = s.length(), count = 0;
        if (n == 1) return 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && s.charAt(i) == '1') count++;
            if (i % 2 == 1 && s.charAt(i) == '0') count++;
        }
        return Math.min(count, n - count);
*/
