/* Link - https://www.geeksforgeeks.org/problems/search-pattern0205/1 */

class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> res = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        int[] lps = computeLPSArray(pat);
        int i = 0;  
        int j = 0; 
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                res.add(i - j );
                j = lps[j - 1];  
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];  
                } else {
                    i++;
                }
            }
        }
        return res;
    }
    private int[] computeLPSArray(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int length = 0; 
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1]; 
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
