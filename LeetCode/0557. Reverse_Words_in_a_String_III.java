/* Link - https://leetcode.com/problems/reverse-words-in-a-string-iii/ */

class Solution {
    public String reverseWords(String s) {
        char c []=s.toCharArray();
        int start=0;
        int end=0;

        while(start<c.length){
            while(end<c.length && c[end]!=' '){
                end++;
            }

            reverse(start, end-1, c);
            start=end+1;
            end=start;
        }
        return new String(c);
    }
    public void reverse(int l , int r, char c[]){
        while(l<r){
            char temp=c[l];
            c[l++]=c[r];
            c[r--]=temp;
        }        
    }
}



/* 
String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        return sb.toString().trim();
*/
