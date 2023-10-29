/* Link - https://leetcode.com/problems/divide-array-into-equal-pairs/ */

class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int pair=0;
        for(int x : nums){
            if(set.contains(x)){
                pair++;
                set.remove(x);
            }
            else set.add(x);
        }
        System.gc();
        return (nums.length/2)==pair;
    }
}

/*
int[] arr = new int[1000];
        for(int i: nums) arr[i]++;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0) return false;
        }
        return true;
 */
