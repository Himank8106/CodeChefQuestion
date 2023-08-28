/* Link - https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ */

class Solution {
    public int mostWordsFound(String[] sentences) {
        return findAns(sentences);
    }

    private static int findAns(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            max = Math.max(getWords(words[i]), max);
        }
        return max;
    }

    private static int getWords(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                sum++;
            }
        }
        return sum + 1;
    }
}

/*
public int mostWordsFound(String[] sentences) {
    int max = 0;
    for(int i=0; i<sentences.length; i++){
        int count = 0; 
        for(int j=0; j<sentences[i].length(); j++){
            if(sentences[i].charAt(j) == ' '){
                count++;
            }
            if(count>max){
                max = count;
            }
        }
    }
    return max+1;
}
*/
