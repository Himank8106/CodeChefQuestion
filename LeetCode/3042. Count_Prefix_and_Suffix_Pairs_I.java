/* Link - https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/ */

class Solution {
    private boolean word(String a, String b){
        if(b.startsWith(a) && b.endsWith(a)) return true;
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if(word(words[i],words[j])) ans++;
            }
        }
        return ans;
    }
}
