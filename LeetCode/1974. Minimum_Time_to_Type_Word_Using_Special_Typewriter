/* Link - https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/ */

class Solution {
    public int minTimeToType(String word) {
        char[] charArr = word.toCharArray();
        char prev = 'a';
        int diff = 0, min = 0; 
        int seconds = 0;
        for(int i=0; i<charArr.length; i++){
            diff = Math.abs(charArr[i] - prev);
            min = Math.min(diff, 26-diff);
            seconds += min+1;
            prev=charArr[i];
        }
        return seconds;
    }
}


/* 
char start = 'a', end = ' ';
        int count = 0;
        for(int i=0; i<word.length(); ++i){
            end = word.charAt(i);
            int num = Math.abs(start-end);
            count += Math.min(num, 26-num);
            start = end;
        }
        return count+word.length();
*/
