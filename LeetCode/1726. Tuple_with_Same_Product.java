/* Link - https://leetcode.com/problems/tuple-with-same-product/ */

class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int prod = nums[i]*nums[j];
                hm.put(prod, hm.getOrDefault(prod, 0)+1);
            }
        }
        for(int x: hm.values()){
            if(x>1) ans += (x*(x-1)*4); 
        }
        return ans;
    }
}
