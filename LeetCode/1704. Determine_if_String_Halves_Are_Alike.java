/* Link - https://leetcode.com/problems/determine-if-string-halves-are-alike/ */

class Solution {
    public boolean halvesAreAlike(String s) {

        int c = 0;
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                if(i < s.length()/2)
                    c++;
                else 
                    c--;
            }
        }   
        return c == 0;
    }
}

/* 
return s.substring(0,s.length()/2).replaceAll("[^aeiouAEIOU]","").length() ==
s.substring(s.length()/2, s.length()).replaceAll("[^aeiouAEIOU]","").length();
*/
 
    
/* 
    public boolean halvesAreAlike(String s) {
        return C(s, 0, s.length() / 2) == C(s, s.length() / 2, s.length());
    }
    private int C(String s, int i, int j) {
        int c = 0;

        for (int a = i; a < j; ++a) {
            c += "aeiouAEIOU".indexOf(s.charAt(a)) != -1 ? 1 : 0;
        }
        return c;
    } 
*/
