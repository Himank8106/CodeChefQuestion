/* Link - https://leetcode.com/problems/sort-array-by-parity-ii/ */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr=new int[nums.length];
        int placeEven=0;
        int placeOdd=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                arr[placeEven]=nums[i];
                placeEven+=2;
            }else{
                arr[placeOdd]=nums[i];
                placeOdd+=2;
            }
        }
        return arr;
    }
    int[] nums={4,2,5,7};
    int[] a= sortArrayByParityII(nums);
}

/*
int odd=1, even=0;
        int[] arr = new int[nums.length];
        for(int i: nums){
            if(i%2==0){
                arr[even] = i;
                even += 2;
            }
            else{
                arr[odd] = i;
                odd += 2;
            }
        }
        return arr;
*/
