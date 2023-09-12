/* Link - https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/ */

class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int res = 0;
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            int freq = arr[i];
            while (freq > 0) {
                if (!used.contains(freq)) {
                    used.add(freq);
                    break;
                } 
                freq--;
                res++;
            }
        }
        return res; 
    }
}


/* 
 int[] charFreq = new int[26];
        Set<Integer> existingFreq = new HashSet<>();
        for(char c : s.toCharArray()){
            charFreq[c -'a']++;
        }
        int delete = 0;
        Arrays.sort(charFreq);
        for(int i=charFreq.length-1; i>=0; i--){
            int currFreq = charFreq[i];
            while(currFreq>0 && existingFreq.contains(currFreq)){
                delete++;
                currFreq--;
            }
            existingFreq.add(currFreq);
        }
        return delete;
*/
