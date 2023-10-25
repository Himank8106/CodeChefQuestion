/* Link - https://leetcode.com/problems/k-th-symbol-in-grammar/ */

class Solution {
    public int kthGrammar(int n, int k) {
        boolean b = true;
        n = (int)Math.pow(2,n);
        while(n!=1){
            n /= 2;
            if(k>n){
                k -= n;
                b = !b;
            }
        }
        return (b?0:1);
    }
}
