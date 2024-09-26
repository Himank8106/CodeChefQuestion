/* Link - https://www.geeksforgeeks.org/problems/roof-top-1587115621/1 */

class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int i=1,j=0;
        int max=0;
        while(i<arr.length){
            int cnt=0;
            while(i<arr.length&&arr[j]<arr[i]){
                j++;i++;
                cnt++;
            }
            max=Math.max(cnt,max);
            i++;j++;
        }
        return max;
    }
}
