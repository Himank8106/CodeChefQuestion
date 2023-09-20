/* Link - https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/ */

class Solution {
    public int[] finalPrices(int[] prices) {
       int n = prices.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        System.gc();
        return prices;
    }
}

/* 
 int[] ans = new int[prices.length];
        for(int i=0; i<prices.length-1; i++){
            int a = 0;
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){
                    a = prices[j];
                    break;
                }
                else{
                    continue;
                }
            }
            ans[i] = prices[i] - a;
            a = 0;
        }
        ans[prices.length-1] = prices[prices.length-1];
        return ans;
*/
