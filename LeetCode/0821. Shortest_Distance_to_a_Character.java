/* Link - https://leetcode.com/problems/shortest-distance-to-a-character/ */

class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
            char[] chars = s.toCharArray();
            for(int i = 0; i < chars.length; i++){

                if(chars[i] == c){
                    DFS(result, chars, c, i + 1, i);
                    DFS(result, chars, c, i - 1, i);
                }
            }

            return result;
    }
    private void DFS(int[] result, char[] chars, char c, int i, int pos) {
            if(i < 0 || i >= result.length) return;
            if(chars[i] == c) return;
            int abs = Math.abs(pos - i);
            if(result[i] != 0 && result[i] <= abs) return;

            result[i] = abs;
            DFS(result, chars, c, i + 1, pos);
            DFS(result, chars, c, i - 1, pos);
        }
}



/* 
StringBuilder s = new StringBuilder(str);

        int ans[] = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                ans[i]=0;
                continue;
            }
            String s1 = s.substring(0,i);
            String s2 = s.substring(i+1);

            int a = s1.lastIndexOf(c);
            int b = s2.indexOf(c);

            if(a==-1) a = Integer.MAX_VALUE;
            else a = s1.length()-a;

            if(b==-1) b = Integer.MAX_VALUE;
            else b = b+1;


            ans[i] = Math.min(a,b);
        }

        return ans;
*/
