/* Link - https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1 */

class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int st=0, end=n-1;
        int ans=-1;
        while(st<=end){
            if(st==n-1){
                ans=n-1;
                break;
            }
            int mid= st+((end-st))/2;
            if(arr1[mid]==arr2[mid]) 
               st=mid+1;
            else{
                ans= mid;
                end= mid-1;
            }
        }
        
        return ans;
    }
}
