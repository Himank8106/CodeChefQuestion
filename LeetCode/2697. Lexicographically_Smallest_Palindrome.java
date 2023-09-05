/* Link - https://leetcode.com/problems/lexicographically-smallest-palindrome/ */

class Solution {
    public String makeSmallestPalindrome(String s) {
        char cs[] = s.toCharArray();
        for (int i = 0, j = cs.length - 1; i < j; ++i, --j) {
            if (cs[i] != cs[j]) {
                cs[i] = cs[j] = cs[i] < cs[j] ? cs[i] : cs[j];
            }
        }
        return String.valueOf(cs);
    }
}

/* 
char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0, j = n - 1; i < n / 2; i++, j--)
            if(arr[i] != arr[j]){
                char smallOne = (char) Math.min(arr[i], arr[j]);
                arr[i] = arr[j] = smallOne;
            }
        return new String(arr);
*/

/* 
        for(int i=0; i<s.length()/2; i++){
            char c = (char)Math.min((int)s.charAt(i), (int)s.charAt(s.length()-1-i));
            s = s.substring(0,i) + c + s.substring(i+1, s.length()-1-i) +
                c + s.substring(s.length()-i);
        }
        return s;
*/

