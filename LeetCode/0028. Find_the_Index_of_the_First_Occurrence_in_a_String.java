/* Link - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/ */

class Solution {
    public int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength) return -1;
        if (haylength == needlelength) return haystack.equals(needle) ? 0 : -1;
        for (int i = 0; i < haylength - needlelength + 1; i++) {
            System.out.println(haystack.substring(i, i+needlelength));
            if (haystack.substring(i, i+needlelength).equals(needle)) return i; 
        }
        return -1;
    }
}


/* 
if(haystack.startsWith(needle)) return 0;
return haystack.indexOf(needle);
*/
