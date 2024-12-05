/* Link - https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1 */

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void swap(int[] arr,int i,int j){
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    
    public void sort012(int[] arr) {
        // code here
        int l = 0,r = arr.length - 1;
        int c = 0;
        
        while(c <= r){
            if(arr[c] == 0){
                swap(arr,l,c);
                l++;
                c++;
            }else if(arr[c] == 2){
                swap(arr,r,c);
                r--;
            }else{
                c++;
            }
        }
    }
}
