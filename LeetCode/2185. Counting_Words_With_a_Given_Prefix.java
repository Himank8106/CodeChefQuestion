/* Link - https://leetcode.com/problems/counting-words-with-a-given-prefix/ */

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<=words.length-1; i++){
            if(words[i].indexOf(pref)==0) count++;
        }
        return count;
    }
}

   

/* 
int count = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() >= pref.length()){
                if(pref.equals(words[i].substring(0,pref.length()))){
                    count++;
                }
            }
        }
        return count;
*/
