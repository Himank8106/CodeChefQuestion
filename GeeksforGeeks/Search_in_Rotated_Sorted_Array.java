/* Link - https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1 */

class Solution {
   int search(int[] arr, int key) {
        // Complete this function
        //position of smallest determines the rotation shifts
        int n=arr.length,p1=0,p2=n-1;
        
        while((p1<=p2) && p1<n && p2>0){
            if(arr[p1]==key) return p1;
            if(arr[p2]==key) return p2;
            
             p1=p1+1;
             p2=p2-1;
            
        }
        
        return -1;
    }
}
