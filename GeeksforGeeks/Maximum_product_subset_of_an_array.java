/* Link - https://www.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1 */

class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // code here
        if (arr.size() == 1) return arr.get(0);
        int maxNeg = Integer.MIN_VALUE, zero=0, nonZero=0;
        long ans = 1;
        for(int i:arr){
            if(i!=0){
                nonZero = 1;
                ans = (ans*i)%1000000007; 
            }
            else zero = 1;
            if(i<0 && i>maxNeg) maxNeg = i;
        }
        if(nonZero!=1) return 0;
        if(arr.size()==2 && zero==1 && ans<0) return 0; 
        if(ans<0) ans /= maxNeg;
        return ans;
    }
}
