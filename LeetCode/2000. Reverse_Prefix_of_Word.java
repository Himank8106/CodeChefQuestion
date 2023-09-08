/* Link - https://leetcode.com/problems/reverse-prefix-of-word/ */

class Solution {
    public String reversePrefix(String word, char ch) {
        int a = word.indexOf(ch);
        if( a== -1) return word;
        char[] c = word.toCharArray();
        for(int i=0; i<=a/2; i++){
            char b = c[i];
             c[i] = c[a-i];
            c[a-i] = b;
        }
        String s = String.valueOf(c);
        return s;
    }
}



/* 
int index = word.indexOf(ch);
        if(index == -1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0,index+1));
        return sb.reverse().toString()+word.substring(index+1);
*/
