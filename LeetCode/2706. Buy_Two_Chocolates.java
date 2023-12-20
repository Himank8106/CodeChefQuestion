/* Link - https://leetcode.com/problems/buy-two-chocolates/ */

class Solution {
    public int buyChoco(int[] price, int money) {
        int cheapest1 = Integer.MAX_VALUE, cheapest2 = Integer.MAX_VALUE;
        for (int p : price) {
            if (p < cheapest1) {
                cheapest2 = cheapest1;
                cheapest1 = p;
            } else if (p < cheapest2) {
                cheapest2 = p;
            }
        }
        int total = cheapest1 + cheapest2;
        return (money >= total) ? money - total : money;
    }
}


/* 
Arrays.sort(price);
        int total = price[0] + price[1];
        return (money >= total) ? money - total : money;
*/
