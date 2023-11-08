/* Link - https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/ */

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map = new int[1001];
        for(int i=0;i<target.length;i++){
            map[target[i]]++;
            map[arr[i]]--;
        }

        for(int a:map){
            if(a!=0){
                return false;
            }
        }

        return true;
    }
}

/* 
Arrays.sort(arr); Arrays.sort(target);
        for(int i=0; i<arr.length; i++){
            if(target[i] != arr[i]) return false;
        }
        return true;
*/
