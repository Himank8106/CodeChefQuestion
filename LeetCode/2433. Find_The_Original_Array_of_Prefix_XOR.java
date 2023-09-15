/* Link - https://leetcode.com/problems/find-the-original-array-of-prefix-xor/ */

class Solution {
    public int[] findArray(int[] pref) {
        int temp = pref[0];
        for(int i = 1; i < pref.length; i++){
            pref[i - 1] ^= pref[i];
        }
        System.arraycopy(pref, 0, pref, 1, pref.length-1);
        pref[0] = temp;

        System.gc();
        
        return pref;
    }
}

/*
int[] ans = new int[pref.length];
ans[0] = pref[0];
for(int i=1; i<pref.length; i++){
    ans[i] = pref[i-1]^pref[i];
}
return ans;
*/
