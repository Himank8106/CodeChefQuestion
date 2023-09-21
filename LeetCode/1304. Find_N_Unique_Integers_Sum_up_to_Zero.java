/* Link - https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/ */

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < n; i=i+2) {
                arr[i] = i+1;
                arr[i + 1] = -(i+1);
            }
        } else {
            arr[0] = 0;
            for (int i = 1; i < n; i=i+2) {
                arr[i] = i;
                arr[i + 1] = -i;
            }
        }
        return arr;
    }
}
 
/* 
int[] ans = new int[n];
        if(n==1){
            ans[n-1]=0;
            return ans;
        }
        int temp = 0;
        if(n%2==0) temp = n;
        if(n%2!=0){
            temp = n-1;
            ans[n-1] = 0;
        }
        for(int i=0; i<temp; i+=2){
            ans[i] = i+1;
            ans[i+1] = -(i+1);
        }
        return ans;
*/
