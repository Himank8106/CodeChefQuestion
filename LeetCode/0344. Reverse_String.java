/* Link - https://leetcode.com/problems/reverse-string/ */

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
       for(int i=0; i<(n/2); i++){
           swap(s,i,n-i-1);
       } 
       for(int i=0; i<n; i++){
            System.out.print(s[i]);
       }
    }
    public void swap(char[] s,int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}



/* 
public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){
            char c = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = c;
        }
    }
*/
