/* Link - https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/ */

class Solution {
    public int minimumLength(String s) {
        int l=0, r=s.length()-1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            char c = s.charAt(l);
            while(l<=r && s.charAt(l)==c) l++;
            while(l<=r && s.charAt(r)==c) r--;
        }
        return (l>r)?0:r-l+1;
    }
}
