/* Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            maxS=Math.max(maxS,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        System.gc();
        return maxS;
    }
}

/* 
        int buy = Integer.MAX_VALUE, sell=0, msell=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            sell = prices[i] - buy;
            if(sell>msell){
                msell = sell;
            }
        }
        return msell;
*/

