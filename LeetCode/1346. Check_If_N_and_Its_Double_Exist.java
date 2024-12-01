/* Link - https://leetcode.com/problems/check-if-n-and-its-double-exist/ */

class Solution {
    public boolean checkIfExist(int[] arr) {
        int zero = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
            if(arr[i]==0) zero++; 
            if(zero>1) return true;
        }
        for(int x: hs){
            if(x==0) continue;
            if(hs.contains(2*x)) return true;
        }
        return false;
    }
}
