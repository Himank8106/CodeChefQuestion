/* Link - https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/ */

class Solution {
    public String generateTheString(int n) {
        char[] str = new char[n];
        Arrays.fill(str, 'a');
        if(n%2==0) {
            str[0] = 'b';
        }
        return new String(str); 
    }
}

/* 
String s = "a";
        if(n%2==0){
            return s.repeat(n-1)+"b";
        }
        else{
            return s.repeat(n);
        }
*/
