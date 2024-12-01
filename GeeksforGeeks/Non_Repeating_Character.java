/* Link - https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1 */

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i))==1) return s.charAt(i);
        }
        return '$';
    }
}
