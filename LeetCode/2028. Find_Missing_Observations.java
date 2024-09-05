/* Link - https://leetcode.com/problems/find-missing-observations/ */

class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0, m=rolls.length ,total = mean*(n+m); 
        for(int x: rolls) sum += x;
        int rem = total-sum;
        if(rem<n || rem>n*6) return new int[0];
        int base = rem/n, remainder = rem%n;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = base + (i<remainder?1:0);
        } 
        return arr;
    }
}
