/* Link - https://leetcode.com/problems/sentence-similarity-iii/ */

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] word1 = sentence1.split(" ");
        String[] word2 = sentence2.split(" ");
        if(word1.length<word2.length){
            String[] temp = word1;
            word1 = word2;
            word2 = temp;
        }
        int start=0, end=0, n1=word1.length, n2=word2.length;
        while(start<n2 && word1[start].equals(word2[start])) start++;
        while(end<n2 && word1[n1-end-1].equals(word2[n2-end-1])) end++;
        return start+end >= n2;
    }
}
