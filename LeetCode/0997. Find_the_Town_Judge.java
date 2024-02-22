/* Link - https://leetcode.com/problems/find-the-town-judge/description/?envType=daily-question&envId=2024-02-22 */

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] countTrusts = new int[n+1];
        for(int[] t : trust) {
            countTrusts[t[0]] = -1;
            if(countTrusts[t[1]] == -1) continue;
            countTrusts[t[1]]++;
        }
        for(int i=1; i <n+1; i++){
            if(countTrusts[i] == n-1) return i;
        }
        return -1;
    }
}

/* 
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n+1];
        for(int i=0; i<trust.length; i++){
            arr[trust[i][0]]--; arr[trust[i][1]]++;
        }
        for(int i=1; i<=n; i++){
            if(arr[i]==n-1) return i;
        }
        return -1; 
    }
}
*/
