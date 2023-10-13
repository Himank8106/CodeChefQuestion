/* Link - https://leetcode.com/problems/min-cost-climbing-stairs/ */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a=0, b=0;
        for(int i=cost.length-1; i>=0; i--){
            int j = cost[i] + Math.min(a,b);
            a = b;
            b = j;
        }
        System.gc();
        return Math.min(a,b);
    }
}

/* 
int[] arr = new int[cost.length];
        arr[0] = cost[0]; arr[1] = cost[1];
        for(int i=2; i<cost.length; i++){
            arr[i] = cost[i] + Math.min(arr[i-1], arr[i-2]);
        } 
        return Math.min(arr[cost.length-1], arr[cost.length-2]);
*/
