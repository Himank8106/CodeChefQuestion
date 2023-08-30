/* Link - https://leetcode.com/problems/truncate-sentence/ */

class Solution {
    public String truncateSentence(String s, int k) {
        int curWordsEncountered = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                curWordsEncountered++;
                if (curWordsEncountered == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}

/* 
        int a=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                k--;
            }
            if(k==1){
                a = i;
            }
        }
        return s.substring(0, a+1);
*/
