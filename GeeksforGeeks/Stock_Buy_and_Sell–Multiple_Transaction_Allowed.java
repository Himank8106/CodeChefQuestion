/* Link - https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1 */

class Solution {
     public int maximumProfit(int prices[]) {
      int n = prices.length;
      
      int profit = 0;
      for(int i=0; i<n-1; i++){
          if(prices[i+1] > prices[i]){
              profit += prices[i+1] - prices[i];
          }
      }
      return profit;
    }
}
