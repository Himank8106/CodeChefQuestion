/* Link - https://leetcode.com/problems/optimal-partition-of-string/ */

class Solution {
    public int partitionString(String s) {
        int sL = s.length();
        int bitMask = 0;
        int numParts = 1;

        byte[] chars = new byte[sL];
        s.getBytes(0, sL, chars, 0);

        for (byte c : chars) {
            int charMask = 1 << c;

            if ((bitMask & charMask) != 0) {
                ++numParts;
                bitMask = charMask;
            } else {
                bitMask |= charMask;
            }
        }

        return numParts;
    }
}

/* 
HashSet<Character> hs = new HashSet<>();
        int i = 0;
        int count = 0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(hs.add(c)){
              i++;
            }
            else{
                count++;
                hs.clear();
                hs.add(c);
                i++;
            }
        }
        return count+1;
*/
