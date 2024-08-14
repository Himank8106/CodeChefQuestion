/* Link - https://www.geeksforgeeks.org/problems/longest-common-substring1452/1 */ 

class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int max = 0;
        for(int i=0; i<str1.length(); i++){
            String s = "";
            for(int j=i; j<str1.length(); j++){
                s += str1.charAt(j);
                if(str2.contains(s)) max = Math.max(max, s.length());
            }
        }
        return max;
    }
}
