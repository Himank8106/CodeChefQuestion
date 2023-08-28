/* Link - https://leetcode.com/problems/decode-xored-array/ */

class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] dec = new int[n + 1];
        dec[0] = first;
        for(int i = 1; i <= n; i++){
            dec[i] = (encoded[i - 1] ^ dec[i - 1]);
        }
        return dec;
    }
}

/*
        int []ans=new int[(encoded.length)+1];
        ans[0]=first;
        for(int i=0;i<(encoded.length);i++){
            ans[i+1]=ans[i]^encoded[i];
        }
        System.gc();
        return ans;
*/

/* 
        int[] ans = new int[encoded.length+1];
        ans[0]=first;
        for(int i=0; i<encoded.length; i++){
            ans[i+1] = encoded[i]^ans[i];
        }
        return ans;
*/
