/* Link - https://leetcode.com/problems/count-prefixes-of-a-given-string/ */

class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(s.startsWith(words[i])) count++;
        }
        return count;
    }
}

/* 
int count = 0;
        for(int i=0; i<words.length; i++){
            if(s.length() >= words[i].length() &&  words[i].equals(s.substring(0,words[i].length()))){
                count++;
            }
        }
        return count;
*/
