/* Link - https://leetcode.com/problems/count-the-number-of-consistent-strings/ */

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            String s = words[i];
            boolean b = true;
            for(int j=0; j<s.length(); j++){
                if(!allowed.contains(String.valueOf(s.charAt(j)))){
                    b = false;
                    break;
                }
            }
            if(b) count++;
        }
        return count;
    }
}
