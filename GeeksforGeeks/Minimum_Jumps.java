/* Link - https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1 */

class Solution {
    static int minJumps(int[] arr) {
       int n=arr.length;
       
       int jumps=0;
       int maxReach=0,curReach=0;
       for(int i=0;i<n;i++){
           if(i>maxReach)return -1;
           if(i>curReach){
               curReach=maxReach;
               jumps++;
           }
           maxReach=Math.max(maxReach,i+arr[i]);
       }
       return jumps;
    }
}
