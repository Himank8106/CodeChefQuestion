/* Link - https://leetcode.com/problems/is-subsequence/ */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0;
        int n = t.length() , m = s.length(); 
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        if(m < 1)   return true;
        while(i < n){
        if(tt[i] == ss[j]){
            j++;
        }
        i++;
        if(j==m)    return true;
        }
        return false;
    }
}


/* 
int si = 0, ti = 0;
        while(si<s.length() && ti<t.length()){
            if(s.charAt(si)==t.charAt(ti)){
                si++;
            }
            ti++;
        }
        return si == s.length();
*/ 
