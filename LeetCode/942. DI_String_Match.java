/* Link - https://leetcode.com/problems/di-string-match/ */

class Solution {
    public int[] diStringMatch(String s) {
        char[] arr = s.toCharArray();
        int[] perm = new int[arr.length + 1];
        int i = 0, h = 0, t = arr.length;
        while (i < arr.length) {
            if (arr[i] == 'I') {
                perm[i++] = h++;
            } else {
                perm[i++] = t--;
            }
        }
        perm[arr.length] = h;
        System.gc();
        return perm;
    }
}

/* 
int[] arr = new int[s.length()+1];
        int low=0, high=s.length();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='I'){
                arr[i] = low;
                low++;
            }
            else{
                arr[i] = high;
                high--;
            }
        }
        arr[s.length()] = low;
        return arr;
*/
