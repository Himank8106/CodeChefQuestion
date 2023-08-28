/* Link - https://leetcode.com/problems/shuffle-the-array/ */

class Solution {
    public int[] shuffle(int[] nums, int n) {
    int[] arr=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2){
           arr[i]=nums[j];
           arr[i+1]=nums[j+n];
           j++;
        }
        // System.gc();
        return arr;
    }
}


/*      int[] arr = new int[2*n];
        int a = 0, b=1;
        for(int i=0; i<n; i++){
            arr[a]=nums[i];
            a+=2;
        }
        for(int i=n; i<2*n; i++){
            arr[b]=nums[i];
            b+=2;
        }
        return arr;
*/
