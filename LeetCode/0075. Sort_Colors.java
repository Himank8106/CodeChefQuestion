/* Link - https://leetcode.com/problems/sort-colors/ */

class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        int i = 0;
        for(int num: nums) arr[num]++;
        for(int j=0; j<3; j++){
            while(arr[j]>0){
                nums[i] = j;
                arr[j]--;
                i++;
            }
        }
    }
}
