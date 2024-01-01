/* Link - https://leetcode.com/problems/assign-cookies/description */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1, j = s.length - 1;
        int c = 0;
        while(i >= 0 && j >= 0){
            if(g[i] <= s[j]){
                j--;
                c++;
            }
            i--;
        }
        return c;
    }
}

/*
 Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++)
	        if(g[i]<=s[j]) i++;
        return i;
*/
