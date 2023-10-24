/* Link - https://leetcode.com/problems/first-letter-to-appear-twice/ */

class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']>1){
                return s.charAt(i);
            }
        }
        return 'a';
    }
}
