/* Link - https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/ */

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return namString(firstWord)+namString(secondWord)==namString(targetWord);
    }
    private int namString(String s){
        int sum=0;
        for(char ss:s.toCharArray()){
            sum=sum*10+ss-'a';
        }
        return sum;
    }
}



/* 
String a="", b="", c="";
        for(int i=0; i<firstWord.length(); i++){
            a += firstWord.charAt(i)-'a';
        }
        for(int i=0; i<secondWord.length(); i++){
            b += secondWord.charAt(i)-'a';
        }
        for(int i=0; i<targetWord.length(); i++){
            c += targetWord.charAt(i)-'a';
        }
        int d = Integer.parseInt(a) + Integer.parseInt(b);
        int e = Integer.parseInt(c);
        return d==e;
*/
