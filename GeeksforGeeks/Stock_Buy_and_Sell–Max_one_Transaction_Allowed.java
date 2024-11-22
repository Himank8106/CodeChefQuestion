/* Link - https://www.geeksforgeeks.org/problems/buy-stock-2/1 */

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int p = 0, max = prices[prices.length-1];
        for(int i=prices.length-2; i>=0; i--){
            if(prices[i]>max) max = prices[i];
            p = Math.max(p, max-prices[i]);
        }
        return p;
    }
}
