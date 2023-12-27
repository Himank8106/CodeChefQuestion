/* Link - https://leetcode.com/problems/minimum-time-to-make-rope-colorful/ */

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int needed=0;
        int n=neededTime.length;
        char[] chc=colors.toCharArray();
        int cur_max=neededTime[0];
        for(int i=1;i<n;i++){
            if(chc[i-1]!=chc[i]){
                cur_max=neededTime[i];
            }else{
                needed+=Math.min(cur_max, neededTime[i]);
                cur_max=Math.max(cur_max, neededTime[i]);
            }
        }
        return needed;
    }
}
   
/* 
int time = 0;
        int n = colors.length();
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                time += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return time;
*/
