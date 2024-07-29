/* Link - https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1 */

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int i=0, j=arr[i].length-1, ans=-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==0) i++;
            else{
                ans = i;
                j--;
            }
        }
        return ans;
    }
}
